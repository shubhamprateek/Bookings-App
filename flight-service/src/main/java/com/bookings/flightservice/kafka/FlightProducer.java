package com.bookings.flightservice.kafka;

import com.bookings.basemodels.events.FlightEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class FlightProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlightProducer.class);
    private NewTopic topic;
    private KafkaTemplate<String, FlightEvent> kafkaTemplate;
    public FlightProducer(NewTopic topic, KafkaTemplate<String, FlightEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(FlightEvent event){
        LOGGER.info(String.format("FLight Event Created. Added a new flight => %s", event.toString()));

        Message<FlightEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }

}
