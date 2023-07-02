package com.bookings.basemodels.events;

import com.bookings.basemodels.entities.Seat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SeatEvent {
    private String message;
    private String status;
    private Seat seat;
}
