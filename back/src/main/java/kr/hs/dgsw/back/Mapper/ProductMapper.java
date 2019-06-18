package kr.hs.dgsw.back.Mapper;

import kr.hs.dgsw.back.Domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    List<Product> findAll();
    Product findById(@Param("id") Long id);
    Long add(Product p);
    int modify(Product p);
    int deleteById(@Param("id") long id);

}
