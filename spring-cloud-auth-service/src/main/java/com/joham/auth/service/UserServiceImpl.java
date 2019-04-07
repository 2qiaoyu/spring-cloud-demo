package com.joham.auth.service;


import com.joham.auth.domain.User;
import com.joham.auth.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @author joham
 */
@Service
public class UserServiceImpl implements UserService {


    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @Autowired
    private UserDao userDao;

    @Override
    public void create(User user) {

        String hash = encoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);

    }
}
