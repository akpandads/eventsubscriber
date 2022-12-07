package com.akpanda.eventsubscriber.config;

import com.akpanda.eventsubscriber.model.EventModel;
import com.akpanda.eventsubscriber.processor.EventProcessor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @Autowired
    EventProcessor eventProcessor;

    @RabbitListener(queues = {"${rabbit.quorom.queue.name}"})
    public void receiveQuoromQueue( EventModel eventModel) {
        eventProcessor.processMessage(eventModel);
    }
    @RabbitListener(queues = {"${rabbit.stream.queue.name}"})
    public void receiveStreamQueue( EventModel eventModel) {
        eventProcessor.processMessage(eventModel);
    }
}
