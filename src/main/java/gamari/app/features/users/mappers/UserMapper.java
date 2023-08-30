package gamari.app.features.users.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import gamari.app.features.users.models.User;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();
}
