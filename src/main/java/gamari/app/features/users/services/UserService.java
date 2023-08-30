package gamari.app.features.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gamari.app.features.users.mappers.UserMapper;
import gamari.app.features.users.models.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }
}
