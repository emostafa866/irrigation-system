package com.task.irrigationSystem.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(DuplicatedRowException.class)
public ResponseEntity<?> handleDuplicatedException(DuplicatedRowException ex, WebRequest webRequest){
     ErrorDetails errorDetails=new ErrorDetails(ex.getMessage(), webRequest.getDescription(false));
     return ResponseEntity
             .status(HttpStatus.CONFLICT)
             .body(errorDetails);
}

}
