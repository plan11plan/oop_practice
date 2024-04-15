package org.example.orderFood;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CustomerTest {


    @DisplayName("메뉴이름에 해당하는 요리를 주문한다.")
    @Test
    void orderTest() {
        Customer customer = new Customer();

        Menu menu = new Menu(List.of(
                new MenuItem("돈까스", 5000),
                new MenuItem("냉면", 7000)));

        Cooking cooking = new Cooking();
        /**
         * 고객이 메뉴이름만 넘기면 되지 않나요?
         * 근데 메서드 내부에서  메뉴로 메뉴 아이템을 선택하기 때문에, 메뉴가 필요함
         */
        assertThatCode(()-> customer.order("돈까스",menu,cooking))
               .doesNotThrowAnyException();
    }
}
