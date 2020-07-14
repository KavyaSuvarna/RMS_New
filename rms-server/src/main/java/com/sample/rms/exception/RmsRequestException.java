package com.sample.rms.exception;

public class RmsRequestException extends RuntimeException {
    public RmsRequestException(String message) {
        super(message);
    }

    public RmsRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
