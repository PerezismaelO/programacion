package com.rpg.handler;

public class rpgDataException extends RuntimeException {
    public rpgDataException(String message) {
        super(message);   // pasa el mensaje a Exception
    }
}
