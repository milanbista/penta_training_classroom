package com.banking;

import java.util.List;

public class DebitCardService implements Card {

    private static final List<User> users = BankingDatabase.userdatabase;

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
