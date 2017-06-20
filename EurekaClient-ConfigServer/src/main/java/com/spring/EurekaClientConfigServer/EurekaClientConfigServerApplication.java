package com.spring.EurekaClientConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @EnableConfigServer 注解开启配置服务器
* @ClassName: EurekaClientConfigServerApplication 
* @author fanyiqing
* @date 2017年6月20日 下午2:05:48
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class EurekaClientConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientConfigServerApplication.class, args);
	}
}
