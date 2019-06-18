package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();
    List<Post> findAllByProductId(Long productId);
    List<Post> findAllByMainCategory(int mainCategory);
    List<Post> findAllByMainCategoryAndSubCategory(int mainCategory, int subCategory);
    Post findById(Long id);
    Long add(Post p);
    int modify(Post p);
    int deleteById(Long id);
}
