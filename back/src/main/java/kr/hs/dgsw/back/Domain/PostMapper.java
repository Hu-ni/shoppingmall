package kr.hs.dgsw.back.Domain;

import kr.hs.dgsw.back.Domain.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
    List<Post> findAllByProductId(@Param("productId") Long productId);
    List<Post> findAllByMainCategory(@Param("mainCategory") int mainCategory);
    List<Post> findAllByMainCategoryAndSubCategory(@Param("mainCategory") int mainCategory, @Param("subCategory") int subCategory);
    Post findById(@Param("id") Long id);
    Long add(Post p);
    int modify(Post p);
    int deleteById(@Param("id") Long id);
}
