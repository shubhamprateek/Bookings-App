package com.bookings.basemodels.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "airport")
public class Airport {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aircraft_type")
    private int airportId;
    @Id
    @Column(name = "airport_code")
    private String airportCode;
    @Column(name = "airport_name")
    private String airportName;
    @Column(name = "location")
    private String location;

    public Airport(int airportId, String airportCode, String airportName, String location) {
        this.airportId = airportId;
        this.airportCode = airportCode;
        this.airportName = airportName;
        this.location = location;
    }

    public Airport() {

    }

    public int getAirportId() {
        return airportId;
    }

    public void setAirportId(int airportId) {
        this.airportId = airportId;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Airport{" +
                "airportId=" + airportId +
                ", airportCode='" + airportCode + '\'' +
                ", airportName='" + airportName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
