package org.example.strategy;

import lombok.Setter;

@Setter
public class PaymentServiceBad {
    private int cost;
    private boolean includeDelivery;

    public void processOrder(){
        // pop-up to collect card details...
        CreditCard card = new CreditCard("cardNumber", "expiryDate", "cvv");
        // validate credit card...
        System.out.println("Paying " + getTotal() + " using Credit Card");
        card.setAmount(card.getAmount() - getTotal());
        // in case of having more payment methods, a bad idea would be
        // to have an else if for the other payment option (violates the open/closed principle)
        // it would also contradict the single responsibility principle too
    }
    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}
