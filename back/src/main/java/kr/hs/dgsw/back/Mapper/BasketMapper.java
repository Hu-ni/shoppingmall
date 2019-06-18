package kr.hs.dgsw.back.Mapper;

import kr.hs.dgsw.back.Domain.Basket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BasketMapper {
    List<Basket> findAllByUserId(@Param("userId") Long userId);
    Basket findById(@Param("id") Long id);
    Basket findByProductId(@Param("productId") Long productId);
    Long add(Basket b);
    int modify(Basket b);
    int deleteById(@Param("id") Long id);
}
