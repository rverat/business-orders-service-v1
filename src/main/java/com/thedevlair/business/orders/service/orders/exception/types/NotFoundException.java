package com.thedevlair.business.orders.service.orders.exception.types;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String message, Object... args) {
        super(String.format(message, args));
    }
}
