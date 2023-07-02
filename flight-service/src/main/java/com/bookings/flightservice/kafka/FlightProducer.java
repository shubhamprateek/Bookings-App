package com.bookings.flightservice.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class FlightProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(FlightProducer.class);
    private NewTopic topic;
    private KafkaTemplate<String, OrdersEvent> kafkaTemplate;

}
