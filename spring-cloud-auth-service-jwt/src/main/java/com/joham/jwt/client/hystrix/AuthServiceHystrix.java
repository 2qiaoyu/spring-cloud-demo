package com.joham.jwt.client.hystrix;


import com.joham.jwt.client.AuthServiceClient;
import com.joham.jwt.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * @author joham
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {

    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        return null;
    }
}
