package com.task.irrigationSystem.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class ErrorDetails {
    private String message;

    private String uri;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy hh:mm:ss")
    private Date timeStamp;


    public ErrorDetails(String message, String uri) {
        this.message = message;
        this.uri = uri;
        this.timeStamp = new Date();
    }
}
