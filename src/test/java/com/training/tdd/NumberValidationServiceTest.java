package com.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberValidationServiceTest {
    private NumberValidationService numberValidationService;

    @BeforeEach
    public void setup(){
        numberValidationService = new NumberValidationService();
    }

    @Test
    public void validateNumber(){
        Assertions.assertEquals(numberValidationService.isValid(2), true);
        Assertions.assertEquals(numberValidationService.isValid(200), false);
    }
}
