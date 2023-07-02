package com.bookings.flightservice.kafka;

import com.bookings.basemodels.events.FlightEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class FlightConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlightConsumer.class);
    @KafkaListener(topics = "${spring.kafka.topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(FlightEvent event){
        LOGGER.info(String.format("Flight event received in flight service=> %s", event.toString()));

    }
}
