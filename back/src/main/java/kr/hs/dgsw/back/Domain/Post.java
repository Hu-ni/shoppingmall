package kr.hs.dgsw.back.Domain;

import lombok.Data;

@Data
public class Post {
    private long id;
    private long productId;
    private String productInfo;
    private String purchaseInfo;
    private int mainCategory;
    private int subCategory;
}
