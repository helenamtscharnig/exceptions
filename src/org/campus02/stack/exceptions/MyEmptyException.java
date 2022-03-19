package org.campus02.stack.exceptions;

public class MyEmptyException extends Exception{
    public MyEmptyException() {
    }

    public MyEmptyException(String message) {
        super(message);
    }
}
