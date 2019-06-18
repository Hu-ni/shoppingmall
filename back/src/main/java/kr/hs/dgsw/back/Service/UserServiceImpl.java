package kr.hs.dgsw.back.Service;

import kr.hs.dgsw.back.Domain.User;
import kr.hs.dgsw.back.Mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper um;

    @Override
    public User findBySeq(Long seq) {
        return this.um.findBySeq(seq);
    }

    @Override
    public User findByUser(User u) {
        return this.um.findByUser(u);
    }

    @Override
    public User findById(String id){
        return this.um.findById(id);
    }

    @Override
    public Long add(User u) {
        return this.um.add(u);
    }

    @Override
    public int modify(User u) {
        return this.um.modify(u);
    }

    @Override
    public int deleteBySeq(long seq) {
        return this.um.deleteBySeq(seq);
    }

}
