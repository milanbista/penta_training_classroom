package com.banking;

import java.util.List;



public class CreditCardService implements Card, CreditCard {
    public void test(){

    }

    private static final List<User> users = BankingDatabase.userdatabase;

    @Override
    public boolean issueCard(String user, int userId) {
        for (User u: users){

            if(u.getUserId() == userId){
                u.setCreditCardBalance(500.00);
                System.out.println("Credit card issue to"+u.getUsername()+"Have a $500 limit");
                return true;
            }
        }
                           return false;
            }



    @Override
    public boolean payBill(int userId, double amount) {
        for(User u: users){

            if(u.getUserId()==userId){

                u.setCreditCardBalance(u.getCreditCardBalance()+amount);
                System.out.println("Bill of $amount " + amount + "paid sucessfully");
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean purchase(int userId, double amount) {
        for (User u : users) {

            if (u.getUserId() == userId) {
                if (u.getCreditCardBalance() >= amount) {
                    u.setCreditCardBalance((u.getCreditCardBalance() - amount));
                    System.out.println("Purchase of " + amount + "is sucessfull");
                    return true;
                } else {
                    System.out.println("Not enough credit balance");
                }
            }
            }
            return false;
        }

    @Override
    public double requestLimitIncrease(int userId,double amount) {
        for(User u:users){

            if(u.getUserId()==userId){

            }
            u.setCreditCardBalance(u.getCreditCardBalance()+amount);

        }
        return 0;
    }

    @Override
    public boolean acceptBalanceFromDebitCard(int userId, double amount) {
        return false;
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

}


