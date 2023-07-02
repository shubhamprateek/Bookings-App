package com.bookings.basemodels.events;
import com.bookings.basemodels.entities.Seat;
import com.bookings.basemodels.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEvent {
    private String message;
    private String status;
    private User user;
}
