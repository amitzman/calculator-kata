package com.calculator;

public class Calculator {

    public String calculate (Integer number1, Integer number2, String operator) {
        Integer result = number1 / number2;

        isValidOperator(operator);

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("subtract")) {
            result = number1 - number2;
        } else if (operator.equals("multiply")) {
            result = number1 * number2;
        }
        return result.toString();
    }

    private void isValidOperator(String operator) {
        if (!(operator.equals("add") || operator.equals("subtract") || operator.equals("multiply") || operator.equals("divide"))){
            throw new IllegalArgumentException("Operator must be add, subtract, multiply or divide");
        }
    }
}
