package com.project.purplecow.exceptions;

public class BadRequestException extends RuntimeException{

    BadRequestException(Long id) {
        super("Bad Request for id: " + id);
    }
}
