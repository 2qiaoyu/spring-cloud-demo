package com.joham.auth.repository;

import com.joham.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author joham
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
