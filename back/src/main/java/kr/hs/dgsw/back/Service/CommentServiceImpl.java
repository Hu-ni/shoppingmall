package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.Comment;
import kr.hs.dgsw.back.Domain.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService{
    @Autowired
    CommentMapper cm;

    @Override
    public List<Comment> findAllByPostId(Long postId) {
        return this.cm.findAllByPostId(postId);
    }

    @Override
    public List<Comment> findAllByUserId(Long userId) {
        return this.cm.findAllByUserId(userId);
    }

    @Override
    public Comment findById(Long id) {
        return this.cm.findById(id);
    }

    @Override
    public Long add(Comment c) {
        return this.cm.add(c);
    }

    @Override
    public int modify(Comment c) {
        return this.cm.modify(c);
    }

    @Override
    public int deleteById(Long id) {
        return this.cm.deleteById(id);
    }
}
