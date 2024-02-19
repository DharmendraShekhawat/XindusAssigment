package com.example.Service;

import com.example.CustomeExceptions.MyUserNotFoundException;
import com.example.Model.RequestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {


       @ExceptionHandler(MyUserNotFoundException.class)
       public ResponseEntity<RequestResponse> handleUserNotFoundException(MyUserNotFoundException e){
             RequestResponse response = new RequestResponse(HttpStatus.NOT_FOUND.value() , e.getMessage());
             return new ResponseEntity<>(response , HttpStatus.NOT_FOUND);
       }
}
