//package com.hc.mall.config;
//
//import com.hc.mall.domain.QueueEnum;
//import org.apache.kafka.clients.admin.NewTopic;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.config.TopicBuilder;
//
//@Configuration
//public class KafkaConfig {
//
//    /**
//     * 订单消息消费的主题（类似于 RabbitMQ 的订单实际消费队列）
//     */
//    @Bean
//    public NewTopic orderTopic() {
//        return TopicBuilder.name(QueueEnum.QUEUE_ORDER_CANCEL.getName())
//                .partitions(3) // 设置分区数量，可根据需求更改
//                .replicas(1) // 设置副本数量
//                .build();
//    }
//}
//
