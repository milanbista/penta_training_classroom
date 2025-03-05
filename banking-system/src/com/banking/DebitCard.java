package com.banking;

public interface DebitCard {

    void deposit(int userId, double amount);
    double withdraw(int userId, double amount);
    double purchase(int userId, double amount);
    boolean balanceTransferToCreditCard(int userId, double amount);

}
