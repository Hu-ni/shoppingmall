package kr.hs.dgsw.back.Controller;

import kr.hs.dgsw.back.Domain.Basket;
import kr.hs.dgsw.back.Service.BasketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BasketController {
    @Autowired
    BasketService bs;

    @GetMapping("/basket/find/all/{userId}")
    public List<Basket> findAllByUserId(@PathVariable Long userId) {
        return this.bs.findAllByUserId(userId);
    }

    @GetMapping("/basket/find/id/{id}")
    public Basket findById(@PathVariable Long id) {
        return this.bs.findById(id);
    }

    @GetMapping("/basket/find/product/{id}")
    public Basket findByProductId(@PathVariable Long id) {
        return this.bs.findByProductId(id);
    }

    @PostMapping("/basket/add")
    public Long add(@RequestBody Basket b) {
        return this.bs.add(b);
    }

    @PutMapping("/basket/edit")
    public int modify(@RequestBody Basket b) {
        return this.bs.modify(b);
    }

    @DeleteMapping("/basket/delete/{id}")
    public int deleteById(@PathVariable Long id) {
        return this.bs.deleteById(id);
    }
}
