package com.banking;

public class User {
    private int userId;
    private String username;
    private double debitCardBalance = 0;
    private double creditCardBalance = 0;

    public User(){

    }

    public User(int userId, String username){
        this.userId = userId;
        this.username = username;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getDebitCardBalance() {
        return debitCardBalance;
    }

    public void setDebitCardBalance(double debitCardBalance) {
        this.debitCardBalance = debitCardBalance;
    }

    public double getCreditCardBalance() {
        return creditCardBalance;
    }

    public void setCreditCardBalance(double creditCardBalance) {
        this.creditCardBalance = creditCardBalance;
    }
}
