package kr.hs.dgsw.back.Domain;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Comment {
    private long id;
    private long userId;
    private long postId;
    private String content;
    private LocalDateTime created;
    private LocalDateTime updated;
}
