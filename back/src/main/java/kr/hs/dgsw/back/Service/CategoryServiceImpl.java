package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Category;
import kr.hs.dgsw.back.Mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    CategoryMapper cm;

    @Override
    public List<Category> findAllMainCategory() {
        return this.cm.findAllMainCategory();
    }

    @Override
    public List<Category> findAllByParent(Long parent) {
        return this.cm.findAllByParent(parent);
    }

    @Override
    public Long add(Category c) {
        return this.cm.add(c);
    }

    @Override
    public int modify(Category c) {
        return this.cm.modify(c);
    }

    @Override
    public int deleteById(Long id) {
        return this.cm.deleteById(id);
    }
}
