package com.joham.repository;

import com.joham.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author joham
 */
public interface UserDao extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
