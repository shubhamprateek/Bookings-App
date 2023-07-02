package com.bookings.basemodels.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "seat")
public class Seat{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private int seatId;

    @Column(name = "seat_number")
    private String seatNumber;

    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @Column(name = "availability_status")
    private String availabilityStatus;

    public Seat(int seatId, String seatNumber, Flight flight, String availabilityStatus) {
        this.seatId = seatId;
        this.seatNumber = seatNumber;
        this.flight = flight;
        this.availabilityStatus = availabilityStatus;
    }

    public Seat() {

    }

    public int getSeatId() {
        return seatId;
    }

    public void setSeatId(int seatId) {
        this.seatId = seatId;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "seatId=" + seatId +
                ", seatNumber='" + seatNumber + '\'' +
                ", flight=" + flight +
                ", availabilityStatus='" + availabilityStatus + '\'' +
                '}';
    }
}
