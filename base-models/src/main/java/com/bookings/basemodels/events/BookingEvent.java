package com.bookings.basemodels.events;

import com.bookings.basemodels.entities.Airport;
import com.bookings.basemodels.entities.Booking;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingEvent {
    private String message;
    private String status;
    private Booking booking;
}
