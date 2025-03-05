package com.banking;

public interface CreditCard  {

    boolean issueCard(String user, int userId);
    boolean payBill(double amount);
    boolean purchase(double amount);
    double requestLimitIncrease(double amount);
    boolean acceptBalanceFromDebitCard(int userId, double amount);
}
