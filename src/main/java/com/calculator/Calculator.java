package com.calculator;

public class Calculator {

    public String calculate (Integer number1, Integer number2, String operator) {
        Integer result = 5;
        if(operator == "add"){
            result = number1 + number2;
        }
        return result.toString();
    }
}
