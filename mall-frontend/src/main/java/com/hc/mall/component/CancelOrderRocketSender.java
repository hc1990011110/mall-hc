package com.hc.mall.component;

import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CancelOrderRocketSender {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;
    private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderRocketSender.class);

    /**
     * 发送简单文本消息
     */
    public void sendSimpleMessage(String topic, String message) {
        LOGGER.info("FUCK topic: " + topic + ", message: " + message);
        rocketMQTemplate.convertAndSend(topic, message);
        LOGGER.info("Message sent to topic: " + topic + ", message: " + message);
    }

    /**
     * 发送带有标记的消息
     */
    public void sendTaggedMessage(String topic, String tag, String message) {
        rocketMQTemplate.convertAndSend(topic + ":" + tag, message);
        LOGGER.info("Tagged message sent to topic: " + topic + ", tag: " + tag + ", message: " + message);
    }

    /**
     * 发送异步消息
     */
    public void sendAsyncMessage(String topic, String message) {
        rocketMQTemplate.asyncSend(topic, message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                LOGGER.info("Async message sent result: " + sendResult);
            }

            @Override
            public void onException(Throwable e) {
                LOGGER.error("Async message send failed: " + e.getMessage(), e);
            }
        });
    }

    /**
     * 发送顺序消息
     */
    public void sendOrderlyMessage(String topic, String message, String orderKey) {
        rocketMQTemplate.syncSendOrderly(topic, message, orderKey);
        LOGGER.info("Orderly message sent to topic: " + topic + ", orderKey: " + orderKey + ", message: " + message);
    }
}
