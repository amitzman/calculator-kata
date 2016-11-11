package com.calculator;

public class Calculator {

    public String calculate (Integer number1, Integer number2, String operator) {
        Integer result = number1;

        isValidOperator(operator);

        switch(operator){
            case("add"): result += number2; break;
            case("subtract"): result -= number2; break;
            case("multiply"): result *= number2; break;
            case("divide"): result /= number2; break;
        }
        return result.toString();
    }

    private void isValidOperator(String operator) {
        if (!(operator.equals("add") || operator.equals("subtract") || operator.equals("multiply") || operator.equals("divide"))){
            throw new IllegalArgumentException("Operator must be add, subtract, multiply or divide");
        }
    }
}
