package com.joham.reign;

import org.springframework.stereotype.Component;

/**
 * @author joham
 */
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String hi(String name) {
        return "hi," + name + ",sorry,error!";
    }
}
