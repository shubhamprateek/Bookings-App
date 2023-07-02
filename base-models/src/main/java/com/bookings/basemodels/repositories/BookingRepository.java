package com.bookings.basemodels.repositories;
import com.bookings.basemodels.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Integer> {
    // You can define custom query methods or use the default methods provided by JpaRepository
}
