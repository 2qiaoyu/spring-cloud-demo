## 《深入理解Spring Cloud与微服务构建》 对应的demo
### 版本
* jdk 1.80_201
* Spring Boot 1.5.20.RELEASE
* Spring Cloud Edgware.SR5
* Mysql 5.6
* RabbitMQ 3.7.4

### 模块
* spring-cloud-admin-server 集成Spring Boot Admin
* spring-cloud-admin-server-turbine 集成Spring Boot Admin 以及Hystrix
  Turbine聚合监控
* spring-cloud-admin-server-turbine-login 集成Spring Boot Admin
  以及Hystrix Turbine聚合监控 Spring Boot Security账号密码登录
* spring-cloud-apollo-client apollo服务消费端
* spring-cloud-auth-service 提供oauth2服务
* spring-cloud-auth-service-jwt 提供jwt接口权限验证
* spring-cloud-config-server 配置中心服务端
* spring-cloud-config-client 配置中心消费端
* spring-cloud-eureka-client eureka连接
* spring-cloud-eureka-client-one
  eureka连接一，配合spring-cloud-admin-server-turbine使用
* spring-cloud-eureka-client-two eureka连接二，配合spring-cloud-admin-server-turbine使用
* spring-cloud-eureka-server eureka服务
* spring-cloud-feign 声明式服务调用
* spring-cloud-gateway-service 网关服务调用user-service
* spring-cloud-ribbon-client 负载均衡
* spring-cloud-service-hi 使用oauth2实现对接口的权限验证管理
* spring-cloud-turbine-service Hystrix Turbine聚合监控服务
* spring-cloud-uaa-service 提供jwt授权服务
* spring-cloud-user-service 会员服务
* spring-cloud-zipkin-server 链路服务
* spring-cloud-zipkin-server-elasticsearch
  使用RabbitMQ传递链路消息，使用Elasticsearch存储，使用Kibana展示链路数据
* spring-cloud-zuul-client 网关服务调用ribbon-client、eureka-client、feign-client