package com.patterns.strategy.strategies;

import com.patterns.strategies.PayStrategy;

public class MyPayStategy {
    private static MyPayStategy instance;

    private PayStrategy payStrategy;

    private MyPayStategy() {

    }

    public static MyPayStategy getInstance() {
        if (instance == null) {
            instance = new MyPayStategy();
        }
        return instance;
    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public boolean pay(int paymentAmount) {
        return payStrategy.pay(paymentAmount);
    }

    public void collectPaymentDetails() {
        payStrategy.collectPaymentDetails();
    }

    public PayStrategy getPayStrategy() {
        return payStrategy;
    }
}
