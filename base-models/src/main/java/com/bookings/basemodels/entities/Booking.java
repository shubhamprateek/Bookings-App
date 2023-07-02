package com.bookings.basemodels.entities;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int bookingId;

    @Column(name = "passenger_name")
    private String passengerName;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @Column(name = "booking_date")
    private Date bookingDate;

    public Booking(int bookingId, String passengerName, User user, Flight flight, Date bookingDate) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.user = user;
        this.flight = flight;
        this.bookingDate = bookingDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", passengerName='" + passengerName + '\'' +
                ", user=" + user +
                ", flight=" + flight +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
