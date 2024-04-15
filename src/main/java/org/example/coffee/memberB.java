package org.example.coffee;

public class memberB implements Cashier{
    Barista barista;

    public memberB(Barista barista){
        this.barista =barista;
    }
    @Override
    public boolean getOrder() {
       return barista.makeCoffee();
    }
}
