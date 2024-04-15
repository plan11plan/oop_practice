package org.example.orderFood;


//요리사 객체
public class Cooking {

    public Cook makeCook(MenuItem menuItem) {
        return new Cook(menuItem);

    }

}
