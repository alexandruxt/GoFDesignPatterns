package org.example.strategy;

import lombok.Setter;

@Setter
public class PaymentService {
    private int cost;
    private boolean includeDelivery;
    private PaymentStrategy strategy;

    public PaymentService(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void processOrder(){
        strategy.collectPaymentDetails();
        strategy.validatePaymentDetails();
        strategy.pay(getTotal());
    }
    private int getTotal() {
        return includeDelivery ? cost + 10 : cost;
    }
}

