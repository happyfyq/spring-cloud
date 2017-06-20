package com.spring.EurekaClientConsumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
/**
 * @EnableFeignClients 使用该注解来开启feign
 * @ClassName: EurekaClientConsumer2Application 
 * @author fanyiqing
 * @date 2017年6月20日 上午9:38:10
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class EurekaClientConsumer2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConsumer2Application.class, args);
	}
}
