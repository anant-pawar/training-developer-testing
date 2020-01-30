package com.training.unit;

public class NumberService {

    public NumberCharacteristics getCharacteristics(Integer number) throws NumberException {
        if(number < 1 || number > 100)
            throw new NumberException();

        NumberCharacteristics.NumberCharacteristicsBuilder numberCharacteristicsBuilder = NumberCharacteristics.builder();

        // check if prime
        numberCharacteristicsBuilder.isPrime(true);

        if (number <= 1)
            numberCharacteristicsBuilder.isPrime(false);

        for (int i = 2; i < number; i++)
            if (number % i == 0)
                numberCharacteristicsBuilder.isPrime(false);


        // check if perfect square
        double squareRoot = Math.sqrt(number);
        numberCharacteristicsBuilder
                .isPerfectSquare((squareRoot - Math.floor(squareRoot)) == 0);


        return numberCharacteristicsBuilder.build();
    }
}
