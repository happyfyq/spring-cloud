package com.spring.EurekaClientFeignHystrix.service.impl;

import org.springframework.stereotype.Component;

import com.spring.EurekaClientFeignHystrix.service.FeignService;
/**
 * fallback之后走的方法类
* @ClassName: FeignServiceImpl 
* @author fanyiqing
* @date 2017年6月20日 上午10:46:52
 */
@Component
public class FeignServiceImpl  implements FeignService{

    @Override
    public String testClient(String name) {
        return "sorry"+name;
    }
}
