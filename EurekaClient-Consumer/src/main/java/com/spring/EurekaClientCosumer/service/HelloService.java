package com.spring.EurekaClientCosumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/**
 * 这里我们根据服务提供者在注册中心注册的服务名称使用getForObject 来调用提供者提供的方法
* @ClassName: HelloService 
* @author fanyiqing
* @date 2017年6月19日 下午5:24:18
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    //这里的SERVICE-PROVIDER服务名称大小写都可以
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hi?name="+name,String.class);
    }

}
