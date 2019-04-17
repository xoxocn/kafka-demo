package com.xoxo.kafka.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Package com.xoxo.kafka.client
 * @Description 对外暴露produce接口
 * @Author xiehua@zhongshuheyi.com
 * @Date 2019-04-17 11:43
 */
@FeignClient("kafka-server")
public interface ShopInterface {

    @GetMapping("shop-topic/sendMsg")
    String sendShopMessage(@RequestParam(value = "content") String content);

}
