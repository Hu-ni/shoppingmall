package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findAllByPostId(Long postId);
    List<Comment> findAllByUserId(Long userId);
    Comment findById(Long id);
    Long add(Comment c);
    int modify(Comment c);
    int deleteById(Long id);
}
