package kr.hs.dgsw.back.Controller;

import kr.hs.dgsw.back.Domain.Product;
import kr.hs.dgsw.back.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService ps;

    @GetMapping("/product/find/all")
    List<Product> findAll(){
        return this.ps.findAll();
    }

    @GetMapping("/product/find/{id}")
    Product findById(@PathVariable Long id){
        return this.ps.findById(id);
    }

    @PostMapping("/product/add")
    Long add(@RequestBody Product p){
        return this.ps.add(p);
    }

    @PutMapping("/product/edit")
    int modify(@RequestBody Product p){
        return this.ps.modify(p);
    }

    @DeleteMapping("/product/delete/{id}")
    int deleteById(@PathVariable long id){
        return this.ps.deleteById(id);
    }
}
