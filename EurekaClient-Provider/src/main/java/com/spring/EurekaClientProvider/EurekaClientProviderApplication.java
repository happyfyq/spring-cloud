package com.spring.EurekaClientProvider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @EnableEurekaClient该注解，表明此应用是服务的客户端，既可以是服务消费者，也可以是服务提供者，这里我们当服务提供者用
 * @ClassName: EurekaClientProviderApplication 
 * @author fanyiqing
 * @date 2017年6月19日 下午5:03:58
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProviderApplication.class, args);
	}
}
