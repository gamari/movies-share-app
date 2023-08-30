package gamari.app.features.users.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import gamari.app.features.users.mappers.UserMapper;
import gamari.app.features.users.models.User;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void register(User user) {
        String uuid = UUID.randomUUID().toString();
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setId(uuid);
        user.setPassword(hashedPassword);
        userMapper.insert(user);

    }
}
