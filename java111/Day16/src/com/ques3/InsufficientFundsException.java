package com.ques3;

public class InsufficientFundsException extends Exception{

    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(String message) {
        super(message);
    }
}
