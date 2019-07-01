package kr.hs.dgsw.back.Mapper;

import kr.hs.dgsw.back.Domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    User findBySeq(@Param("seq") Long seq);
    User findByUser(@Param("id") String id, @Param("pw") String pw);
    Long add(User u);
    Long addWithHomeNumber(User u);
    int modify(User u);
    int deleteBySeq(@Param("seq") long seq);
    User findById(String id);

}
