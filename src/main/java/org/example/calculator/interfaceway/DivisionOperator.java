package org.example.calculator.interfaceway;

public class DivisionOperator implements NewArithmeticOperatorV2{
    @Override
    public boolean supports(String operator) {
        return operator.equals("/");
    }

    @Override
    public int calculate(PositiveNumber operand1, PositiveNumber operand2) {

        return operand1.toInt() / operand2.toInt();
    }
}
