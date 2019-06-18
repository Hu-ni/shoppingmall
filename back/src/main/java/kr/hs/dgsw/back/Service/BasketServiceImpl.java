package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Basket;
import kr.hs.dgsw.back.Domain.BasketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BasketServiceImpl implements BasketService{
    @Autowired
    BasketMapper bm;

    @Override
    public List<Basket> findAllByUserId(Long userId) {
        return this.bm.findAllByUserId(userId);
    }

    @Override
    public Basket findById(Long id) {
        return this.bm.findById(id);
    }

    @Override
    public Basket findByProductId(Long productId) {
        return this.bm.findByProductId(productId);
    }

    @Override
    public Long add(Basket b) {
        return this.bm.add(b);
    }

    @Override
    public int modify(Basket b) {
        return this.bm.modify(b);
    }

    @Override
    public int deleteById(Long id) {
        return this.bm.deleteById(id);
    }
}
