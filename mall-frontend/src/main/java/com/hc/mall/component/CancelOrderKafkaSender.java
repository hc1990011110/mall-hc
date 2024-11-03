package com.hc.mall.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class CancelOrderKafkaSender {
    private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderKafkaSender.class);
    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public CancelOrderKafkaSender(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendOrderTimeoutMessage(Long orderId) {
        kafkaTemplate.send("mall.order.cancel", orderId.toString());
        LOGGER.warn("sendOrderTimeoutMessage:{} !!!", orderId);
    }
}
