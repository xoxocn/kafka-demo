package com.xoxo.kafka.server;

import com.xoxo.kafka.channel.ShopChannel;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "shop-topic")
public class ShopService {

    @Resource(name = ShopChannel.SHOP_OUTPUT)
    private MessageChannel sendShopMessageChannel;

    @GetMapping("/sendMsg")
    public String sendShopMessage(String content) {
        boolean isSendSuccess = sendShopMessageChannel.
                send(MessageBuilder.withPayload(content).build());
        return isSendSuccess ? "发送成功" : "发送失败";
    }

    @StreamListener(ShopChannel.SHOP_INPUT_GROUP1)
    public void receiveGroup1(Message<String> message) {
        System.out.println("group1"+"==========="+message.getPayload());
    }
    @StreamListener(ShopChannel.SHOP_INPUT_GROUP2)
    public void receiveGroup2(Message<String> message) {
        System.out.println("group2"+"==========="+message.getPayload());
    }
}