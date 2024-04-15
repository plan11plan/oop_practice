package org.example.calculator;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.example.calculator.interfaceway.PositiveNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/** 요구사항
 * 간단한 사칙연산을 할 수 있다.
 * 양수로만 계산할 수 있다.
 * 나눗셈에서 0을 나누는 경우 IllegalArgument 예외를 발생시킨다.
 * MVC 기반으로 구현한다.
 */
public class CalculatorTest {



    @DisplayName("덧셈 연산을 수행한다.")
    @Test
    void additionTest() {
        int result = Calculator.calculate(new PositiveNumber(1), "+", new PositiveNumber(2));
        assertThat(result).isEqualTo(3);
    }
    @DisplayName("뺄셈 연산을 수행한다.")
    @Test
    void subtractionTest() {
        int result = Calculator.calculate(new PositiveNumber(1), "-", new PositiveNumber(2));
        assertThat(result).isEqualTo(-1);
    }
    @DisplayName("나눗셈 연산을 수행한다.")
    @Test
    void divisionTest() {
        int result = Calculator.calculate(new PositiveNumber(1), "/", new PositiveNumber(2));
        assertThat(result).isEqualTo(0);
    }
    @DisplayName("곱셈 연산을 수행한다.")
    @Test
    void multiplicationTest() {
        int result = Calculator.calculate(new PositiveNumber(1), "*", new PositiveNumber(2));
        assertThat(result).isEqualTo(2);
    }
    //

    @DisplayName("0으로 나누는 경우 IllegalArgument 예외를 발생시킨다.")
    @Test
    void subtractionTest2() {
        assertThatCode( ()->Calculator.calculate(new PositiveNumber(1), "/", new PositiveNumber(0)))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
