package com.training.tdd;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NumberCharacteristics {
    private Boolean isPrime;
    private Boolean isPerfectSquare;
}
