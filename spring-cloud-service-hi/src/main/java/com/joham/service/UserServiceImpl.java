package com.joham.service;


import com.joham.domain.User;
import com.joham.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author joham
 */
@Service
public class UserServiceImpl {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;


    public User create(String username, String password) {

        User user = new User();
        user.setUsername(username);
        String hash = encoder.encode(password);
        user.setPassword(hash);
        User u = userDao.save(user);
        return u;

    }
}
