package com.banking;

public interface CreditCard  {
    public void test();

    boolean issueCard(String user, int userId);
    boolean payBill(int userId, double amount);
    boolean purchase(int userId,double amount);
    double requestLimitIncrease(int userID, double amount);
    boolean acceptBalanceFromDebitCard(int userId, double amount);
}
