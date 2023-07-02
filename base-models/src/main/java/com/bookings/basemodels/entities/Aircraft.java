package com.bookings.basemodels.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "aircraft")
public class Aircraft{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "aircraft_id")

    private int aircraftId;
    @Column(name = "aircraft_type")
    private String aircraftType;
    @Column(name = "capacity")
    private int capacity;

    public Aircraft(int aircraftId, String aircraftType, int capacity) {
        this.aircraftId = aircraftId;
        this.aircraftType = aircraftType;
        this.capacity = capacity;
    }

    public Aircraft() {

    }

    public int getAircraftId() {
        return aircraftId;
    }

    public void setAircraftId(int aircraftId) {
        this.aircraftId = aircraftId;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "aircraftId=" + aircraftId +
                ", aircraftType='" + aircraftType + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
