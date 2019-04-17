package com.xoxo.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface ShopChannel {

    /**
     * 发消息的通道名称
     */
    String SHOP_OUTPUT = "shop_output";

    /**
     * 消息的订阅通道名称
     */
    String SHOP_INPUT_GROUP1 = "shop_input_group1";

    /**
     * 消息的订阅通道名称
     */
    String SHOP_INPUT_GROUP2 = "shop_input_group2";


    /**
     * 发消息的通道
     *
     * @return
     */
    @Output(SHOP_OUTPUT)
    MessageChannel sendShopMessage();

    /**
     * 收消息的通道
     *
     * @return
     */
    @Input(SHOP_INPUT_GROUP1)
    SubscribableChannel recieveShopMessageGroup1();

    /**
     * 收消息的通道
     *
     * @return
     */
    @Input(SHOP_INPUT_GROUP2)
    SubscribableChannel recieveShopMessageGroup2();
}