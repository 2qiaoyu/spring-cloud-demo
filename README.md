## 《深入理解Spring Cloud与微服务构建》 对应的demo
### dome版本
* Spring Boot 1.5.18.RELEASE
* Spring Cloud Edgware.RELEASE

### 模块
* spring-cloud-eureka-client eureka连接
* spring-cloud-eureka-server eureka服务
* spring-cloud-feign 声明式服务调用
* spring-cloud-gateway-service 网关服务调用user-service
* spring-cloud-ribbon-client 负载均衡
* spring-cloud-user-service 会员服务
* spring-cloud-zipkin-server 链路服务
* spring-cloud-zipkin-server-elasticsearch
  使用RabbitMQ传递链路消息，使用Elasticsearch存储，使用Kibana展示链路数据
* spring-cloud-zuul-client 网关服务调用ribbon-client、eureka-client、feign-client