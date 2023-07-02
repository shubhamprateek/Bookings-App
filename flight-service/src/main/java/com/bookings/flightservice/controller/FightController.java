package com.bookings.flightservice.controller;

import com.bookings.basemodels.HTTP.HttpResponse;
import com.bookings.basemodels.entities.Flight;
import com.bookings.basemodels.events.FlightEvent;
import com.bookings.flightservice.kafka.FlightProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class FightController {
    private FlightProducer flightProducer;

    public FightController(FlightProducer flightProducer) {
        this.flightProducer = flightProducer;
    }
    @PostMapping("/addflight")
    public ResponseEntity<HttpResponse> addFlight(@RequestBody Flight flight){
        final HttpResponse response = new HttpResponse();
        try {
            FlightEvent flightEvent = new FlightEvent();
            flightEvent.setStatus("CREATED");
            flightEvent.setMessage("A new flight is added.");
            flightEvent.setFlight(flight);
            flightProducer.sendMessage(flightEvent);
            response.setStatusCode(200);
            response.setMessage("Flight Addition Successful : " + flightEvent.toString());
            return new ResponseEntity<HttpResponse>(response, HttpStatus.OK);
        }
        catch (Exception e) {
            response.setStatusCode(500);
            response.setMessage(e.getMessage());
            return new ResponseEntity<HttpResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
