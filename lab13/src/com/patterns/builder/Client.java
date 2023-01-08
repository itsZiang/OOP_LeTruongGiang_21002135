package com.patterns.builder;

public class Client {
    public static void main(String[] args) {
        BankAccount newAccount = new BankAccount.BankAccountBuilder("OOPBank", "0123456789")
                .setEmail("contact@oopbank.com")
                .setNewsletter(true)
                .build();
        System.out.println(newAccount);

        BankAccount account = new BankAccount.BankAccountBuilder("abc", "09876543421")
                .setMobileBanking(true)
                .build();
        System.out.println(account);
    }
}
