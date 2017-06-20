package com.spring.EurekaClientConfigClient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {
    
    @Value("${foo}")
    String foo;
    
    @RequestMapping(value = "/hi")
    public String hi(){
        return foo;
    }

}
