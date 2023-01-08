package com.patterns.strategy.order;


import com.patterns.strategy.strategies.MyPayStategy;

public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(MyPayStategy strategy) {
        strategy.collectPaymentDetails();
        // Here we could collect and store payment data from the strategy.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}