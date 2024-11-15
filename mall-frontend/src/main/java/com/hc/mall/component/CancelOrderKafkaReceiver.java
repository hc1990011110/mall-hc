//package com.hc.mall.component;
//
//import com.hc.mall.service.OmsPortalOrderService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.kafka.support.Acknowledgment;
//import org.springframework.stereotype.Component;
//
//@Component
//public class CancelOrderKafkaReceiver {
//    private static Logger LOGGER = LoggerFactory.getLogger(CancelOrderKafkaReceiver.class);
//    @Autowired
//    private OmsPortalOrderService portalOrderService;
//
//    @KafkaListener(topics = "mall.order.cancel", groupId = "my-group")
//    public void receiveOrderTimeoutMessage(String orderId, Acknowledgment acknowledgment) {
//        LOGGER.warn("before process orderId:{} KafkaListener!!!",orderId);
//        portalOrderService.cancelOrder(Long.parseLong(orderId));
//        // 成功处理消息后手动提交偏移量
//        acknowledgment.acknowledge();
//        LOGGER.warn("after process orderId:{} KafkaListener!!!",orderId);
//    }
//}
