package com.spring.EurekaClientCosumer.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.EurekaClientCosumer.service.HelloService;
/**
 * 测试调用服务提供者提供的方法
* @ClassName: HelloController 
* @author fanyiqing
* @date 2017年6月19日 下午5:25:51
 */
@RestController
public class HelloController {
    
    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
