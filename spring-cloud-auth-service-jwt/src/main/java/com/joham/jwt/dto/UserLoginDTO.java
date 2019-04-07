package com.joham.jwt.dto;


import com.joham.jwt.entity.JWT;
import com.joham.jwt.entity.User;

/**
 * @author joham
 */
public class UserLoginDTO {

    private JWT jwt;

    private User user;

    public JWT getJwt() {
        return jwt;
    }

    public void setJwt(JWT jwt) {
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
