package com.example.bookings.aircraftservice.kafka;

import com.bookings.basemodels.events.AircraftEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class AircraftProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(AircraftProducer.class);
    private NewTopic topic;
    private KafkaTemplate<String, AircraftEvent> kafkaTemplate;
    public AircraftProducer(NewTopic topic, KafkaTemplate<String, AircraftEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(AircraftEvent event){
        LOGGER.info(String.format("Aircraft Event Created. Added a new aircraft => %s", event.toString()));

        Message<AircraftEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }

}
