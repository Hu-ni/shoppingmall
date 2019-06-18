package kr.hs.dgsw.back.Controller;

import kr.hs.dgsw.back.Domain.Post;
import kr.hs.dgsw.back.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PostController{
    @Autowired
    PostService ps;

    @GetMapping("/post/find/all")
    public List<Post> findAll() {
        return this.ps.findAll();
    }

    @GetMapping("/post/find/all/product/{id}")
    public List<Post> findAllByProductId(@PathVariable Long id) {
        return this.ps.findAllByProductId(id);
    }

    @GetMapping("/post/find/all/{mainCategory}/{subCategory}")
    public List<Post> findAllByCategory(@PathVariable Optional<Integer> mainCategory, @PathVariable Optional<Integer> subCategory) {
        return mainCategory.map(main -> subCategory.isPresent() ? this.ps.findAllByCategory(main, subCategory.get())
                : this.ps.findAllByCategory(main)).orElse(null);
    }

    @GetMapping("/post/find/{id}")
    public Post findById(@PathVariable Long id) {
        return this.ps.findById(id);
    }

    @PostMapping("/post/add")
    public Long add(@RequestBody Post p) {
        return this.ps.add(p);
    }

    @PutMapping("/post/edit")
    public int modify(@RequestBody Post p) {
        return this.ps.modify(p);
    }

    @DeleteMapping("/post/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return this.ps.deleteById(id);
    }
}
