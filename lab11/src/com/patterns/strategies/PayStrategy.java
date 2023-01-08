package com.patterns.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
