package com.bookings.basemodels.events;
import com.bookings.basemodels.entities.Aircraft;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AircraftEvent {
    private String message;
    private String status;
    private Aircraft aircraft;
}
