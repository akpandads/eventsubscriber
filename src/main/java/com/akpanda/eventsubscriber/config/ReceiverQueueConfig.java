package com.akpanda.eventsubscriber.config;


import com.akpanda.eventsubscriber.model.EventModel;
import com.akpanda.eventsubscriber.processor.EventProcessor;
import jakarta.annotation.PostConstruct;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.handler.annotation.Payload;

import java.util.Map;

@Configuration
@EnableRabbit
public class ReceiverQueueConfig {
    @Value("${rabbit.quorom.queue.name}")
    private String quoromQueueName;

    @Value("${rabbit.stream.queue.name}")
    private String streamQueueName;

    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }

}

