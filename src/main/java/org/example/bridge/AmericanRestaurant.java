package org.example.bridge;

public class AmericanRestaurant extends Restaurant{
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }
    @Override
    void addSauce() {
        pizza.setSauce("SECRET SAUCE");
    }

    @Override
    void addToppings() {
        pizza.setToppings("EVERYTHING");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("Thick");
    }
}
