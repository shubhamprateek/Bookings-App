package com.bookings.bookingservice.kafka;

import com.bookings.basemodels.events.BookingEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class BookingProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(BookingProducer.class);
    private NewTopic topic;
    private KafkaTemplate<String, BookingEvent> kafkaTemplate;
    public BookingProducer(NewTopic topic, KafkaTemplate<String, BookingEvent> kafkaTemplate) {
        this.topic = topic;
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(BookingEvent event){
        LOGGER.info(String.format("Booking Event Created. Added a new Booking => %s", event.toString()));

        Message<BookingEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, topic.name())
                .build();
        kafkaTemplate.send(message);
    }

}
