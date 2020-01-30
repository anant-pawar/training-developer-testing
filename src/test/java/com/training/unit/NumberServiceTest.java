package com.training.unit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberServiceTest {
    private NumberService numberService;

    @BeforeEach
    public void setup(){
        numberService = new NumberService();
    }

    @Test
    public void testNumberService(){
        try {
            Assertions.assertEquals(
                    NumberCharacteristics.builder().isPrime(false).isPerfectSquare(false).build(),
                    numberService.getCharacteristics(10)
            );
        } catch (NumberException e) {
            Assertions.assertTrue(false);
        }
    }
}
