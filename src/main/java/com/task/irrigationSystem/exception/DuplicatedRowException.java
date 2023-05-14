package com.task.irrigationSystem.exception;

public class DuplicatedRowException extends RuntimeException {

    public DuplicatedRowException(){
        super();
    }

    public DuplicatedRowException(String message){
        super(message);
    }


}
