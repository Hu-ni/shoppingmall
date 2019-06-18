package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.User;

public interface UserService {
    User findBySeq(Long seq);
    User findByUser(User u);
    Long add(User u);
    int modify(User u);
    int deleteBySeq(long seq);
    User findById(String id);
}
