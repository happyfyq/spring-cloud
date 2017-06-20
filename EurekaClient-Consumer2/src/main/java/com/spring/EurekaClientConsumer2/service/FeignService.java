package com.spring.EurekaClientConsumer2.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @FeignClient("服务名称") 来制定调用哪个服务 ，大小，小写不敏感
* @ClassName: FeignService 
* @author fanyiqing
* @date 2017年6月20日 上午9:45:30
 */
@FeignClient(value = "service-provider")
public interface FeignService {
    
    //这里的路径要写。不写的话，只知道我们利用@FeignClient(value = "service-provider")标志的服务，而不知道是哪个接口
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String testClient(@RequestParam(value = "name") String name);
}
