package com.bookings.basemodels.repositories;

import com.bookings.basemodels.entities.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, String> {
}
