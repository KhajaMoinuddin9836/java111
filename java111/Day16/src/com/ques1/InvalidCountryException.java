package com.ques1;

public class InvalidCountryException extends Exception{

    public InvalidCountryException(){
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}
