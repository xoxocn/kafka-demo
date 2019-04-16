package com.xoxo.kafkaserver;

import com.xoxo.channel.ShopChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
//绑定 channel，每个channel为一个topic
@EnableBinding(ShopChannel.class)
public class KafkaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaServerApplication.class, args);
	}

}
