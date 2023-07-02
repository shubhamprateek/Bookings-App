package com.bookings.basemodels.HTTP;

import lombok.Data;

import java.util.List;

@Data

public class HttpResponse {
    private long statusCode;
    private String message;
    private List<String> validation;
}