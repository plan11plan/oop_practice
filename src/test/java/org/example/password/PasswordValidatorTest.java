package org.example.password;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.example.password.PasswordValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

//todo 비밀번호는 최소 8자 이상 12자 이하여야 한다.
//todo 비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
//todo 경계조건에 대해 테스트 코드를 작성해야 한다.
class PasswordValidatorTest {

    @DisplayName("비밀번호가 최소 8자 이상 12자 이하면 예외 발생 X")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("servicewird"))
                .doesNotThrowAnyException();

    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.")
    @ParameterizedTest
    @ValueSource(strings = {"12345678","12345678910111213"})
    void validatePasswordTest2(){

        assertThatCode(()-> PasswordValidator.validate("1234"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀번호는 최소 8자 이상 12자 이하여야 한다.");
    }

}