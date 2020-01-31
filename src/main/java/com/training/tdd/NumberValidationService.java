package com.training.tdd;

import com.training.unit.NumberException;

public class NumberValidationService {

    public boolean isValid(Integer number){
        if(number < 1 || number > 100)
            return false;
        return true;
    }
}
