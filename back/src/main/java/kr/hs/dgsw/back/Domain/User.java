package kr.hs.dgsw.back.Domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
    private long seq;
    private String id;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    private String name;
    private long phoneNumber;
    private int postNumber;
    private String email;
}
