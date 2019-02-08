package com.joham.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joham
 */
@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("hi")
    public String hi(String name) {
        return "hi" + name + ",i am " + port;
    }
}
