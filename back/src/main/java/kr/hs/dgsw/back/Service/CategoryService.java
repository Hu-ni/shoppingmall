package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Basket;
import kr.hs.dgsw.back.Domain.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAllMainCategory();
    List<Category> findAllByParent(Long parent);
    Long add(Category c);
    int modify(Category c);
    int deleteById(Long id);
}
