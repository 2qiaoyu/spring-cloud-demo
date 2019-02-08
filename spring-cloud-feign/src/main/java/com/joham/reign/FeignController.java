package com.joham.reign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joham
 */
@RestController
public class FeignController {

    @Autowired
    FeignService feignService;

    @GetMapping("hi")
    public String hi(String name) {
        return feignService.hi(name);
    }
}
