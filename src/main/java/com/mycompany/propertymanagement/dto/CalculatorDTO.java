package com.mycompany.propertymanagement.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CalculatorDTO {
    private Double n1;
    private Double n2;
    @JsonProperty("n31") // now in postman i have to send this properity like this: "n31": some double value
    private Double n3;

}
