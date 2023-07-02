package com.bookings.basemodels.entities;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "flight_id")
    private int flight_id;
    @Column(name = "flight_number")
    private String flight_number;
    @Column(name = "no_seats")
    private int no_seats;
    @Column(name = "departure_time")
    private Date departure_time;
    @OneToOne
    @JoinColumn(name = "airportCode")
    private Airport departure_airport;
    @Column(name = "arrival_time")
    private Date arrival_time;
    @OneToOne
    @JoinColumn(name = "airportCode")
    private Airport arrival_airport;

    @OneToOne
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;

    public Flight(int flight_id, String flight_number, int no_seats, Date departure_time, Airport departure_airport, Date arrival_time, Airport arrival_airport, Aircraft aircraft) {
        this.flight_id = flight_id;
        this.flight_number = flight_number;
        this.no_seats = no_seats;
        this.departure_time = departure_time;
        this.departure_airport = departure_airport;
        this.arrival_time = arrival_time;
        this.arrival_airport = arrival_airport;
        this.aircraft = aircraft;
    }

    public Flight() {

    }

    public int getFlight_id() {
        return flight_id;
    }

    public void setFlight_id(int flight_id) {
        this.flight_id = flight_id;
    }

    public String getFlight_number() {
        return flight_number;
    }

    public void setFlight_number(String flight_number) {
        this.flight_number = flight_number;
    }

    public int getNo_seats() {
        return no_seats;
    }

    public void setNo_seats(int no_seats) {
        this.no_seats = no_seats;
    }

    public Date getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(Date departure_time) {
        this.departure_time = departure_time;
    }

    public Airport getDeparture_airport() {
        return departure_airport;
    }

    public void setDeparture_airport(Airport departure_airport) {
        this.departure_airport = departure_airport;
    }

    public Date getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(Date arrival_time) {
        this.arrival_time = arrival_time;
    }

    public Airport getArrival_airport() {
        return arrival_airport;
    }

    public void setArrival_airport(Airport arrival_airport) {
        this.arrival_airport = arrival_airport;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public void setAircraft(Aircraft aircraft) {
        this.aircraft = aircraft;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flight_id=" + flight_id +
                ", flight_number='" + flight_number + '\'' +
                ", no_seats=" + no_seats +
                ", departure_time=" + departure_time +
                ", departure_airport=" + departure_airport +
                ", arrival_time=" + arrival_time +
                ", arrival_airport=" + arrival_airport +
                ", aircraft=" + aircraft +
                '}';
    }
}
