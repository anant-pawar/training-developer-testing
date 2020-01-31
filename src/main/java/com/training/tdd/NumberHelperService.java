package com.training.tdd;

public class NumberHelperService {

    public boolean isPrime(Integer number) {
        if (number <= 1)
            return false;

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;

        return true;
    }

    public boolean isPerfectSquare(Integer number) {
        double squareRoot = Math.sqrt(number);
        return
                ((squareRoot - Math.floor(squareRoot)) == 0);
    }
}
