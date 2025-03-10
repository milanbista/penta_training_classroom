package com.banking;

import java.util.List;

public class DebitCardService implements Card , DebitCard {

    private static final List<User> users = BankingDatabase.userdatabase;
   private double balance;

   public DebitCardService (int userId, double initialBalance){
       this.balance = initialBalance;
   }



    @Override
    public void showDetails(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                System.out.println("\n=================================");
                System.out.println("      User: " + user.getUsername());
                System.out.println("=================================");
                System.out.printf("| %-10s | %-10s | %-15s | %-15s |\n",
                        "User ID", "Name", "Debit Balance", "Credit Balance");
                System.out.println("------------------------------------------------------------");
                System.out.printf("| %-10d | %-10s | $%-14.2f | $%-14.2f |\n",
                        user.getUserId(), user.getUsername(),
                        user.getDebitCardBalance(), user.getCreditCardBalance());
                System.out.println("------------------------------------------------------------");
            }
        }
    }

    @Override
    public void deposit(int userId, double amount) {
       balance = balance + amount;
        System.out.println("The deposited amount " + amount + "New debit balance:" + balance);
    }

    @Override
    public double withdraw(int userId, double amount) {
       if ( amount > balance){
           System.out.println("Insufficient funds");
       }else{
           balance = balance - amount;
           System.out.println("Withdraw amount : " + amount + "Remaining balance is " + balance);
       }
        return 0;
    }

    @Override
    public double purchase(int userId, double amount) {
        if ( amount > balance){
            System.out.println("Insufficient funds");
        }else{
            balance = balance - amount;
            System.out.println("Purchased amount: " + amount + "Remaining balance is " + balance);
        }
        return 0;
    }

    @Override
    public boolean balanceTransferToCreditCard(int userId, double amount) {
        if ( amount > balance){
            System.out.println("Insufficient funds");
        }else{
            balance = balance - amount;
            System.out.println("Transferred amount " + amount + " to Credit card");
            System.out.println("New debit balance: " + balance);
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}


