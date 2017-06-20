package com.spring.EurekaClientCosumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
/**
 * @EnableEurekaClient该注解，表明此应用是服务的客户端，既可以是服务消费者，也可以是服务提供者，这里我们当服务消费者用
* @ClassName: EurekaClientApplication 
* @Description: TODO
* @author fanyiqing
* @date 2017年6月19日 下午4:48:40
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaClientCosumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientCosumerApplication.class, args);
	}
	
	/**
	* 在工程启动的时候，我们注册了一个bean：restTemplate。通过@ LoadBalanced注册表明，这个restRemplate是负载均衡的。
	* @Description: TODO
	* @author:fanyiqing
	* @time:2017年6月19日 下午5:19:35
	 */
	    @Bean
	    @LoadBalanced
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
	
}
