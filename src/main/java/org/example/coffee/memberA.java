package org.example.coffee;

public class memberA implements Customer{

    boolean coffee;
    @Override
    public void orderCoffee(Cashier cashier) {
      coffee = cashier.getOrder();
    }
    public boolean hasCoffee(){
       return coffee;
    }
}
