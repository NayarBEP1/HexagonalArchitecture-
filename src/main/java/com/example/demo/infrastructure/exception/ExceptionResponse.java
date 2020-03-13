package com.example.demo.infrastructure.exception;

import java.util.Date;

public class ExceptionResponse {

    private Date timeStamp;
    private String message;

    public ExceptionResponse(Date timeStamp, String message) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
