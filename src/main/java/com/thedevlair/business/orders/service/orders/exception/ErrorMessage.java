package com.thedevlair.business.orders.service.orders.exception;

import java.util.Date;

public record ErrorMessage(int statusCode, Date timestamp, String message) {
}
