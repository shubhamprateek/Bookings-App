package com.bookings.basemodels.events;

import com.bookings.basemodels.entities.Aircraft;
import com.bookings.basemodels.entities.Airport;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirportEvent {
    private String message;
    private String status;
    private Airport airport;
}
