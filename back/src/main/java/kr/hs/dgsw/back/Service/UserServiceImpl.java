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
    public User findByUser(String id, String pw) {
        return this.um.findByUser(id,pw);
    }

    @Override
    public User findById(String id){
        return this.um.findById(id);
    }

    @Override
    public Long add(User u) {
        if(u.getHomeNumber() == 0) return this.um.add(u);
        else return this.um.addWithHomeNumber(u);
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
