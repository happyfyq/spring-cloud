package com.spring.EurekaClientRibbonHystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
/**
 * 
* @ClassName: HelloService 
* @author fanyiqing
* @date 2017年6月20日 上午10:22:31
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;
    //这里的SERVICE-PROVIDER服务名称大小写都可以
    //fallbackMethod 后面的值是我们在调用服务失败的时候所转向的方法
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-PROVIDER/hi?name="+name,String.class);
    }
    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

}
