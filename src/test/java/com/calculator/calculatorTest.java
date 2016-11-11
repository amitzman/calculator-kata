package com.calculator;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/11/16.
 */
public class calculatorTest {
    @Test
    public void calculate_givenIntegerFiveAndIntegerFiveAndOperatorAdd_returnStringTen() throws Exception {
        Calculator testCalculator = new Calculator();
        String testResult;
        
        testResult = testCalculator.calculate(5, 5, "add");

        assertThat(testResult, equalTo("10"));

    }
}