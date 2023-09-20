package org.example.strategy;

public class PaymentByPaypal implements PaymentStrategy{
    private String email;
    private String password;

    @Override
    public void collectPaymentDetails() {
        email = "email";
        password = "password";
    }

    @Override
    public void validatePaymentDetails() {
        // validate email and password
    }

    @Override
    public void pay(int amount) {
        System.out.println(email + " is paying " + amount + "EUROS; and their password is " + password);
    }
}
