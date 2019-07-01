package kr.hs.dgsw.back.Controller;

import kr.hs.dgsw.back.Domain.User;
import kr.hs.dgsw.back.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    UserService us;

    @GetMapping("/user/find/{seq}")
    public User findBySeq(@PathVariable Long seq){
        return this.us.findBySeq(seq);
    }
    @GetMapping("/user/find")
    public User findByUser(@RequestParam String id, @RequestParam String pw){
        return this.us.findByUser(id,pw);
    }
    @GetMapping("/user/find/id/{id}")
    public User findById(@PathVariable String id){
        return this.us.findById(id);
    }
    @PostMapping("/user/add")
    public Long add(@RequestBody User u){
        return this.us.add(u);
    }
    @PutMapping("/user/edit")
    public int modify(@RequestBody User u){
        return this.us.modify(u);
    }
    @DeleteMapping("/user/delete/{seq}")
    public int deleteBySeq(@PathVariable long seq){
        return this.us.deleteBySeq(seq);
    }

}
