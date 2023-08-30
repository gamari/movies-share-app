package gamari.app.features.users.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import gamari.app.features.users.models.User;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Insert("INSERT INTO users (id, username, password, email) VALUES (#{id}, #{username}, #{password}, #{email})")
    void insert(User user);
}
