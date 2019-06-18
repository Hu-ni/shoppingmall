package kr.hs.dgsw.back.Domain;

import lombok.Data;

@Data
public class Product {
    private long id;
    private String name;
    private String filepath;
    private String price;
    private String publisher;

}
