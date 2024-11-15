package com.hc.mall.component;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

@Service
@RocketMQMessageListener(topic = "order_topic", consumerGroup = "order_group")
public class CancelOrderRocketReceiver implements RocketMQListener<String> {
    @Override
    public void onMessage(String message) {
        System.out.println("Received message: " + message);
    }

}



