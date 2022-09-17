package com.project.purplecow.exceptions;

public class ItemNotFoundException extends RuntimeException{

    ItemNotFoundException(Long id){
        super("Item could not be found for id: " + id);
    }
}
