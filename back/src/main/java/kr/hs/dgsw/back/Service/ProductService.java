package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
    Long add(Product p);
    int modify(Product p);
    int deleteById(long id);
}
