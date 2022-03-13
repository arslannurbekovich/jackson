package com.example.jackson.handlers.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class LogError extends RuntimeException {
    public LogError() {
        super();
    }
    public LogError(String message, Throwable cause) {
        super(message, cause);
    }
    public LogError(String message) {
        super(message);
    }
    public LogError(Throwable cause) {
        super(cause);
    }
}