package org.example.coffee;

public class Main {
    public static void main(String[] args) {
        Customer customer = new memberA();
        Barista barista = new memberC();
        Cashier cashier = new memberB(barista);

        customer.orderCoffee(cashier);
        if(customer.hasCoffee()){
            System.out.println("커피를 받아갔습니다.");
        } else {
            System.out.println("커피 없음~");
        }

    }
}
