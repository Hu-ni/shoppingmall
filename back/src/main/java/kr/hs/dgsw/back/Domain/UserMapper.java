package kr.hs.dgsw.back.Domain;

import kr.hs.dgsw.back.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findBySeq(@Param("seq") Long seq);
    User findByUser(User u);
    User findById(String id);
    Long add(User u);
    int modify(User u);
    int deleteBySeq(@Param("seq") long seq);

}
