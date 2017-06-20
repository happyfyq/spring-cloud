package com.spring.EurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
* @EnableEurekaServer该注解,标志这个应用是一个服务注册中心
* @ClassName: EurekaServerApplication 
* @author fanyiqing
* @date 2017年6月19日 下午4:35:47
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
