package org.example.strategy;

public class PaymentByCreditCard implements PaymentStrategy {

    private CreditCard creditCard;
    @Override
    public void collectPaymentDetails() {
        // get credit card details
        creditCard = new CreditCard("nr", "date", "cvv");
    }

    @Override
    public void validatePaymentDetails() {
        // validate credit card details
    }

    @Override
    public void pay(int amount) {
        creditCard.setAmount(creditCard.getAmount() - amount);
    }
}
