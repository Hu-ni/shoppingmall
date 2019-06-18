package kr.hs.dgsw.back.Controller;

import kr.hs.dgsw.back.Domain.Comment;
import kr.hs.dgsw.back.Service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController{
    @Autowired
    CommentService cs;

    @GetMapping("/comment/find/all/post/{id}")
    public List<Comment> findAllByPostId(@PathVariable Long id) {
        return this.cs.findAllByPostId(id);
    }

    @GetMapping("/comment/find/all/user/{id}")
    public List<Comment> findAllByUserId(@PathVariable Long id) {
        return this.cs.findAllByUserId(id);
    }

    @GetMapping("/comment/find/{id}")
    public Comment findById(@PathVariable Long id) {
        return this.cs.findById(id);
    }

    @PostMapping("/comment/add")
    public Long add(@RequestBody Comment c) {
        return this.cs.add(c);
    }

    @PutMapping("/comment/edit")
    public int modify(@RequestBody Comment c) {
        return this.cs.modify(c);
    }

    @DeleteMapping("/comment/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return this.cs.deleteById(id);
    }
}
