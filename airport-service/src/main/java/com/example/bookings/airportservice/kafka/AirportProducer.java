package com.example.bookings.airportservice.kafka;

import com.bookings.basemodels.events.AirportEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class AirportProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(AirportProducer.class);
    private NewTopic topic;
    private KafkaTemplate<String, AirportEvent> kafkaTemplate;
    public AirportProducer(NewTopic topic, KafkaTemplate<String, AirportEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(AirportEvent event){
        LOGGER.info(String.format("FLight Event Created. Added a new flight => %s", event.toString()));

        Message<AirportEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }

}
