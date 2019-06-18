package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Product;
import kr.hs.dgsw.back.Mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    ProductMapper pm;

    @Override
    public List<Product> findAll() {
        return this.pm.findAll();
    }

    @Override
    public Product findById(Long id) {
        return this.pm.findById(id);
    }

    @Override
    public Long add(Product p) {
        return this.pm.add(p);
    }

    @Override
    public int modify(Product p) {
        return this.pm.modify(p);
    }

    @Override
    public int deleteById(long id) {
        return this.pm.deleteById(id);
    }

}
