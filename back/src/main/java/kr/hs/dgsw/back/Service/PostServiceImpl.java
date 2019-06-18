package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Post;
import kr.hs.dgsw.back.Mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    PostMapper pm;

    @Override
    public List<Post> findAll() {
        return this.pm.findAll();
    }

    @Override
    public List<Post> findAllByProductId(Long productId) {
        return this.pm.findAllByProductId(productId);
    }

    @Override
    public List<Post> findAllByMainCategory(int mainCategory) {
        return this.pm.findAllByMainCategory(mainCategory);
    }

    @Override
    public List<Post> findAllByMainCategoryAndSubCategory(int mainCategory, int subCategory) {
        return this.pm.findAllByMainCategoryAndSubCategory(mainCategory, subCategory);
    }

    @Override
    public Post findById(Long id) {
        return this.pm.findById(id);
    }

    @Override
    public Long add(Post p) {
        return this.pm.add(p);
    }

    @Override
    public int modify(Post p) {
        return this.pm.modify(p);
    }

    @Override
    public int deleteById(Long id) {
        return this.pm.deleteById(id);
    }
}
