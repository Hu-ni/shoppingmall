package kr.hs.dgsw.back.Controller;

import kr.hs.dgsw.back.Domain.Category;
import kr.hs.dgsw.back.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {
    @Autowired
    CategoryService cs;

    @GetMapping("/category/find")
    public List<Category> findAllMainCategory() {
        return this.cs.findAllMainCategory();
    }

    @GetMapping("/category/find/{parent}")
    public List<Category> findById(@PathVariable Long parent) {
        return this.cs.findAllByParent(parent);
    }

    @PostMapping("/category/add")
    public Long add(@RequestBody Category c) {
        return this.cs.add(c);
    }

    @PutMapping("/category/edit")
    public int modify(@RequestBody Category c) {
        return this.cs.modify(c);
    }

    @DeleteMapping("/category/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return this.cs.deleteById(id);
    }
}
