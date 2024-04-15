package org.example.calculator;

import java.util.List;
import org.example.calculator.interfaceway.AdditionOperator;
import org.example.calculator.interfaceway.DivisionOperator;
import org.example.calculator.interfaceway.MultiplicationOperator;
import org.example.calculator.interfaceway.NewArithmeticOperatorV2;
import org.example.calculator.interfaceway.PositiveNumber;
import org.example.calculator.interfaceway.SubtractionOperator;

public class Calculator {
   private final static List<NewArithmeticOperatorV2> arithmeticOperators
           = List.of(new AdditionOperator(),
           new SubtractionOperator(),
           new MultiplicationOperator(),
           new DivisionOperator());

//    public static  int calculate(int operand1,String operator,int operand2){
//        return ArithmeticOperatorV1.calculate(operand1,operator,operand2);
//
//    }

    public static  int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2){
        return arithmeticOperators.stream()
                .filter(arithmeticOperators -> arithmeticOperators.supports(operator))
                .map(arithmeticOperators -> arithmeticOperators.calculate(operand1,operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

    }
}
