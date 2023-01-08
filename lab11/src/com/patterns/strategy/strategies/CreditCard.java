package com.patterns.strategy.strategies;

public class CreditCard {
    private int amount;
    private String number;
    private String date;
    private String cardVerificationValue;

    CreditCard(String number, String date, String cardVerificationValue) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cardVerificationValue = cardVerificationValue;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}