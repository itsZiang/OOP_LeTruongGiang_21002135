package com.patterns.builder;

public class BankAccount {
    private final String name;
    private final String accountNumber;
    private final String address;
    private final String email;
    private final boolean newsletter;
    private final boolean mobileBanking;

    public BankAccount(String name, String accountNumber, String address, String email, boolean newsletter, boolean mobileBanking) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.address = address;
        this.email = email;
        this.newsletter = newsletter;
        this.mobileBanking = mobileBanking;
    }

    public static class BankAccountBuilder {
        private String name;
        private String accountNumber;
        private String address;
        private String email;
        private boolean newsletter;
        private boolean mobileBanking;

        public BankAccountBuilder(String name, String accountNumber) {
            this.name = name;
            this.accountNumber = accountNumber;
        }

        public BankAccountBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public BankAccountBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public BankAccountBuilder setNewsletter(boolean newsletter) {
            this.newsletter = newsletter;
            return this;
        }

        public BankAccountBuilder setMobileBanking(boolean mobileBanking) {
            this.mobileBanking = mobileBanking;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(name, accountNumber, address, email, newsletter, mobileBanking);
        }
    }

    @Override
    public String toString() {
        return "BankAccount[" + "name='" + name + '\'' + ", accountNumber='" + accountNumber + '\'' + ", address='" + address + '\'' + ", email='" + email + '\'' + ", newsletter=" + newsletter + ", mobileBanking=" + mobileBanking + ']';
    }
}
