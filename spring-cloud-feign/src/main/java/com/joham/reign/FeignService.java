package com.joham.reign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author joham
 */
@Service
public class FeignService {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    public String hi(String name) {
        return eurekaClientFeign.hi(name);
    }
}
