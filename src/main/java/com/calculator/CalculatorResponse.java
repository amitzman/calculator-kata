package com.calculator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class CalculatorResponse {
    private String response;

    public CalculatorResponse(String response) {
        this.response = response;
    }
}
