package com.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 11/11/16.
 */
public class calculatorTest {
    String testResult;
    Calculator testCalculator;

    @Before
    public void setUp() throws Exception {
        testCalculator = new Calculator();

    }

    @Test
    public void calculate_givenIntegerFiveAndIntegerFiveAndOperatorAdd_returnStringTen() throws Exception {
        testResult = testCalculator.calculate(5, 5, "add");

        assertThat(testResult, equalTo("10"));

    }

    @Test
    public void calculate_givenIntegerFiveAndIntegerSixAndOperatorAdd_returnsStringEleven() throws Exception {
        testResult = testCalculator.calculate(5, 6, "add");

        assertThat(testResult, equalTo("11"));
    }

    @Test
    public void calculate_givenIntegerTenAndInteger5AndOperatorSubtract_returnsStringFive() throws Exception {
        testResult = testCalculator.calculate(10, 5, "subtract");

        assertThat(testResult, equalTo("5"));
    }

    @Test
    public void calculate_givenIntegerTenAndInteger6AndOperatorSubtract_returnsStringFour() throws Exception {
        testResult = testCalculator.calculate(10, 6, "subtract");

        assertThat(testResult, equalTo("4"));

    }

    @Test
    public void calculate_givenIntegerFourAndIntegerFourAndOperatorMultiply_returnsStringSixteen() throws Exception {
        testResult = testCalculator.calculate(4, 4, "multiply");

        assertThat(testResult, equalTo("16"));

    }

    @Test
    public void calculate_givenIntegerTenAndIntegerTenAndOperationMultiply_returnsStringOneHundred() throws Exception {
        testResult = testCalculator.calculate(10, 10, "multiply");

        assertThat(testResult, equalTo("100"));

    }

    @Test
    public void calculate_givenIntegerFiftyAndIntegerFiveAndOperatorDivide_returnsStringTen() throws Exception {
        testResult = testCalculator.calculate(50, 5, "divide");

        assertThat(testResult, equalTo("10"));
    }

    @Test
    public void calculate_givenIntegerTenAndIntegerTenAndOperatorDivide_returnsStringFive() throws Exception {
        testResult = testCalculator.calculate(10, 2, "divide");

        assertThat(testResult, equalTo("5"));

    }
}