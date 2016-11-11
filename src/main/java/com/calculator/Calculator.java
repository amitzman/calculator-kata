package com.calculator;

public class Calculator {

    public String calculate (Integer number1, Integer number2, String operator) {
        Integer result = 16;
        if(operator.equals("add")){
            result = number1 + number2;
        } else if(operator.equals("subtract")) {
            result = number1 - number2;
        }
        return result.toString();
    }
}
