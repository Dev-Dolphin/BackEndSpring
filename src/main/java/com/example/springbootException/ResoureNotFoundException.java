package com.example.springbootException;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResoureNotFoundException extends RuntimeException {

    private  static  final  long serialVersionUID = 1L;

    public ResoureNotFoundException(String message){
        super(message);
    }
}
