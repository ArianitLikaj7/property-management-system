package com.mycompany.propertymanagement.controller;

import com.mycompany.propertymanagement.dto.CalculatorDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator")
public class CalculatorController {

    @GetMapping("/add")// method level mapping of a url to a controller function
    public Double add(@RequestParam("n1") Double n1, @RequestParam("n2") Double n2){
        return n1 + n2;
    }
    @GetMapping("/sub/{n1}/{n2}")// map the values of url to java variables by Path variables
    public Double substract(@PathVariable("n1") Double n1, @PathVariable("n2") Double n2){
        Double result = null;
        if(n1 > n2){
            result = n1 - n2;
        }
        else {
            result = n2 -n1;
        }
        return result;
    }

    @PostMapping("/mul")
    public Double multiply(@RequestBody CalculatorDTO calculatorDTO){
        Double result = null;
        result = calculatorDTO.getN1() * calculatorDTO.getN2() * calculatorDTO.getN3();
        return result;
    }
}
