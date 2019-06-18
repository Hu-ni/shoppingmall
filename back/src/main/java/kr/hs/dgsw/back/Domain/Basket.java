package kr.hs.dgsw.back.Domain;

import lombok.Data;

@Data
public class Basket {
    private long id;
    private long userId;
    private long productId;
    private int cnt;
}
