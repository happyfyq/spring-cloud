package com.spring.EurekaClientZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * @EnableZuulProxy 开启路由
*  @ClassName: EurekaClientZuulApplication 
*  @author fanyiqing
*  @date 2017年6月20日 上午11:29:55
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class EurekaClientZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientZuulApplication.class, args);
	}
}
