<center>《最详细的spring-cloud教程》</center>

关注我的博客了解详细处理过程：http://happywayq.com/   以后会持续更新。。。

整体目录结构：

- 注册中心： Eureka -EurekaServer   端口号8091
- 服务提供者 ：EurekaClient-Provider  端口号8092 （同时也是服务消费者，这里做服务提供者来用）
- 服务消费者Ribbon ：EurekaClient-Consumer  端口号 8093
- 服务消费者Feign：EurekaClient-Consumer2  端口号8094
- 断路器hystrix（Ribbon下整合hystrix）：EurekaClient-RibbonHytrix  端口号8095
- 断路器hystrix（Feign下整合hystrix）：EurekaClient-FeignHytrix  端口号8096 
- 网关Zuul：EurekaClient-Zuul  端口号8097
- 配置中心spring config server：EurekaClient-ConfigServer 端口号 ；8888（已经高可用）
- 调用配置中心配置：EurekaClient-ConfigClient 端口号：8099
- 持续更新。。。。

如果对你有用，请star奥。。
