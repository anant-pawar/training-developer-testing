package com.training.tdd;

public class NumberService {

    private NumberHelperService numberHelperService;
    private NumberValidationService numberValidationService;

    public NumberService(){
        numberHelperService = new NumberHelperService();
        numberValidationService = new NumberValidationService();
    }

    public NumberCharacteristics getCharacteristics(Integer number) throws NumberException {
        if(!numberValidationService.isValid(number))
            throw new NumberException();

        return NumberCharacteristics
                .builder()
                .isPrime(numberHelperService.isPrime(number))
                .isPerfectSquare(numberHelperService.isPerfectSquare(number))
                .build();
    }
}
