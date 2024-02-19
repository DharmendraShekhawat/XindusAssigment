package com.example.CustomeExceptions;

public class MyUserNotFoundException extends RuntimeException{

    public MyUserNotFoundException(){
        super();
    }


    public MyUserNotFoundException(String message){
        super(message);
    }
}
