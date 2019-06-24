package kr.hs.dgsw.back.Domain;

import lombok.Data;

@Data
public class Category {
    private long id;
    private String name;
    private long parent;
}
