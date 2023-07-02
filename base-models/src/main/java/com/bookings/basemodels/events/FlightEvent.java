package com.bookings.basemodels.events;
import com.bookings.basemodels.entities.Flight;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightEvent {
    private String message;
    private String status;
    private Flight flight;
}
