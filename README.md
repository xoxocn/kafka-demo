# kafka-demo

### kafka-demo介绍

1. 基于spring-cloud开发，kafka使用spring-cloud-stream-kafka。
2. 该项目为基于kafka做mq 快速开发的demo。
### demo架构

1. 该demo，基于微服务的架构方式。提供3层moudle

   ├── client 						// 向外暴露@Feign 接口 依赖common

   ├── common 					// common DTO层，server、client都需要依赖

   ├── server // 上线项目文件		// 服务层，实现client接口

2. 该demo是集p/s（produce/subscription）于一身，如果要拆分成p服务,s服务也很容易拆分。

### demo功能

1. 实现多组消费同一topic
2. 基于springcloud，作为微服务，暴露client于其他服务调用。
