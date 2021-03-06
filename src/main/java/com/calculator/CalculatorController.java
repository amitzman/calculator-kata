package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private Calculator calculator;

    @Autowired
    CalculatorController(Calculator calculator){
        this.calculator = calculator;
    }

    @RequestMapping("/{input1}/{input2}/{inputOperator}")
    @ResponseBody
    public ResponseEntity<CalculatorResponse> getCalculation(@PathVariable("input1") Integer input1, @PathVariable("input2") Integer input2, @PathVariable("inputOperator")String inputOperator) {
        Integer sum = input1 + input2;
        return new ResponseEntity<>(new CalculatorResponse(sum.toString()), HttpStatus.OK);
    }
}
