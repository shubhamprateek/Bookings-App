package com.bookings.basemodels.repositories;
import com.bookings.basemodels.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
