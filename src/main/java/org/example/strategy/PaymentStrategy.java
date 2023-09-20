package org.example.strategy;

public interface PaymentStrategy {
    void collectPaymentDetails();
    void validatePaymentDetails();
    void pay (int amount);
}
