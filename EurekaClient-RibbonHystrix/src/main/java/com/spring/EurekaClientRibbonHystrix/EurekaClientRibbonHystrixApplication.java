package com.spring.EurekaClientRibbonHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * 基于EurekaClient-Consumer改造
 * @EnableHystrix 该注解开启断路器
 * @ClassName: EurekaClientRibbonHystrixApplication 
 * @author fanyiqing
 * @date 2017年6月20日 上午10:20:21
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class EurekaClientRibbonHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientRibbonHystrixApplication.class, args);
	}
	
	@Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
	}
}
