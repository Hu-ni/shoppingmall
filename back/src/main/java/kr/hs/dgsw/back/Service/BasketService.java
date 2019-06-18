package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Basket;

import java.util.List;

public interface BasketService {
    List<Basket> findAllByUserId(Long userId);
    Basket findById( Long id);
    Basket findByProductId(Long productId);
    Long add(Basket b);
    int modify(Basket b);
    int deleteById(Long id);
}
