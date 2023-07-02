package com.example.bookings.seatservice.kafka;

import com.bookings.basemodels.events.SeatEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class SeatProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(SeatProducer.class);
    private NewTopic topic;
    private KafkaTemplate<String, SeatEvent> kafkaTemplate;
    public SeatProducer(NewTopic topic, KafkaTemplate<String, SeatEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(SeatEvent event){
        LOGGER.info(String.format("Seat Event Created. Added new Seats => %s", event.toString()));

        Message<SeatEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }

}
