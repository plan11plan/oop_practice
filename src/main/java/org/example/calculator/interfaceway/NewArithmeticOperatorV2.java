package org.example.calculator.interfaceway;

public interface NewArithmeticOperatorV2 {
    boolean supports(String operator);

    int calculate(PositiveNumber operand1,PositiveNumber operand2);
}
