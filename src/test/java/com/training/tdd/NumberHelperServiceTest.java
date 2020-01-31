package com.training.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberHelperServiceTest {
    private NumberHelperService numberHelperService;

    @BeforeEach
    public void setup(){
        numberHelperService = new NumberHelperService();
    }

    @Test
    public void testNumberIsPrime(){
        Assertions.assertEquals(numberHelperService.isPrime(3), true);
        Assertions.assertEquals(numberHelperService.isPrime(4), false);
    }

    @Test
    public void testNumberIsPerfectSquare(){
        Assertions.assertEquals(numberHelperService.isPerfectSquare(3), false);
        Assertions.assertEquals(numberHelperService.isPerfectSquare(4), true);
    }
}
