package kr.hs.dgsw.back.Domain;

import kr.hs.dgsw.back.Domain.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CommentMapper {
    List<Comment> findAllByPostId(@Param("postId") Long postId);
    List<Comment> findAllByUserId(@Param("userId") Long userId);
    Comment findById(@Param("id") Long id);
    Long add(Comment c);
    int modify(Comment c);
    int deleteById(@Param("id") Long id);
}
