package kr.hs.dgsw.back.Mapper;

import kr.hs.dgsw.back.Domain.Basket;
import kr.hs.dgsw.back.Domain.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<Category> findAllMainCategory();
    List<Category> findAllByParent(@Param("parent") Long parent);
    Long add(Category c);
    int modify(Category c);
    int deleteById(@Param("id") Long id);
}
