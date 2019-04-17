package com.xoxo.kafka.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Package com.xoxo.channel
 * @Description sell Topic
 * @Author xiehua
 * @Date 2019-04-16 17:42
 */
public interface SellChannel {

    /**
     * 发消息的通道名称
     */
    String SELL_OUTPUT = "sell_output";

    /**
     * 消息的订阅通道名称
     */
    String SELL_INPUT = "sell_input";

    /**
     * 发消息的通道
     * @return
     */
    @Output(SELL_OUTPUT)
    MessageChannel sendSellMessage();

    /**
     * 收消息的通道
     * @return
     */
    @Input(SELL_INPUT)
    SubscribableChannel recieveSellMessage();
}
