package com.spring.EurekaClientFeignHystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * 基于EurekaClient-Consumer2改造
 * feign已经整合了hystrix，如果不想使用在配置文件配置即可
* @ClassName: EurekaClientFeignHystrixApplication 
* @author fanyiqing
* @date 2017年6月20日 上午10:38:59
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClientFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientFeignHystrixApplication.class, args);
	}
	
	
}
