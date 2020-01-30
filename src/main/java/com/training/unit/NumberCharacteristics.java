package com.training.unit;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class NumberCharacteristics {
    private boolean isPrime;
    private boolean isPerfectSquare;
}
