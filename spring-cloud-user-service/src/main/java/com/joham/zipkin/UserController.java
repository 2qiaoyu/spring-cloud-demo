package com.joham.zipkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joham
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String hi() {
        return "I am joham";
    }
}
