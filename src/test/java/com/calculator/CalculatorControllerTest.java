package com.calculator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by localadmin on 11/11/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @Mock
    Calculator mockCalculator;
    private MockMvc calculatorController;

    @Before
    public void setup () throws Exception {
        calculatorController = MockMvcBuilders.standaloneSetup(new CalculatorController(mockCalculator)).build();
    }

    @Test
    public void getCalculator_passedTwoIntegersAndOperator_returnsApplicationJSON_andResponseString() throws Exception {
        String expected = "5";
        int userInput1 = 2;
        int userInput2 = 3;
        String userOperatorInput = "add";
        doReturn(expected).when(mockCalculator).calculate(userInput1, userInput2, userOperatorInput);

        calculatorController.perform(get("/calculator/{input1}/{input2}/{input3}", userInput1, userInput2, userOperatorInput))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(jsonPath("$.response").value(any(String.class)));

    }

    @Test
    public void getCalculator_passedIntegerTwoInteger3AndOperatorAdd_ReturnsStringSix() throws Exception {
        int userInput1 = 3;
        int userInput2 = 3;
        String userOperatorInput = "add";

        calculatorController.perform(get("/calculator/{input1}/{input2}/{input3}", userInput1, userInput2, userOperatorInput))
            .andExpect(jsonPath("$.response").value(is("6")));
    }

    @Test
    public void getCalculator_passedIntegerTenIntegerFiveAndOperatorSubtract_RetrunsStringFive() throws Exception {
        int userInput1 = 10;
        int userInput2 = 5;
        String userOperatorInput = "subtract";

        calculatorController.perform(get("/calculator/{input1}/{input2}/{input3}", userInput1, userInput2, userOperatorInput))
                .andExpect(jsonPath("$.response").value(is("5")));
    }
}