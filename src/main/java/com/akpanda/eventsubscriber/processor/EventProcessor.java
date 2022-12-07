package com.akpanda.eventsubscriber.processor;

import com.akpanda.eventsubscriber.model.EventModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class EventProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventProcessor.class);

    public void processMessage(EventModel eventModel){
        LOGGER.info("Received message :"+ eventModel.getMessage());
    }
}
