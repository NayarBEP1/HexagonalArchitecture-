package com.example.demo.domain.model;

import com.example.demo.domain.exceptions.GeneralException;

public final class DataValidator {

    public static void validateNull(String value, String message){
        if(value == null || value.isEmpty()){
            throw new GeneralException(message);
        }
    }
}
