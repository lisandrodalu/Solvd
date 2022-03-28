package com.solvd.exceptions;

public class NonExistantRoomException extends Exception{
    public NonExistantRoomException() {
    }

    public NonExistantRoomException(String message) {
        super(message);
    }
}
