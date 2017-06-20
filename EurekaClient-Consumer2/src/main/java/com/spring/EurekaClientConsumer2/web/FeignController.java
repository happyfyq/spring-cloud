package com.spring.EurekaClientConsumer2.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.EurekaClientConsumer2.service.FeignService;
/**
 * 调用feign接口的方法
* @ClassName: FeignController 
* @Description: TODO
* @author fanyiqing
* @date 2017年6月20日 上午9:52:31
 */
@RestController
public class FeignController {
    
    @Autowired
    FeignService feignService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String test(@RequestParam String name){
        return feignService.testClient(name);
    }
}
