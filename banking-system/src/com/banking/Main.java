package com.banking;

public class Main {
    public static void main(String[] args) {

        DebitCardService debitCardService = new DebitCardService();
        CreditCardService creditCardService = new CreditCardService();

        User user1 = new User((int) (Math.random() * 1000) + 345, "Sam");
        User user2 = new User((int) (Math.random() * 1000) + 345, "Richard");


        BankingDatabase.userdatabase.add(user1);
        BankingDatabase.userdatabase.add(user2);

        debitCardService.showDetails(user1.getUserId());
        creditCardService.showDetails(user1.getUserId());

        //nikita works on debit card
        // you need to work on DebitCardService
        // inherit Debit Card and implement all the methods
        // users are already created above
        // do not touch CreditCard Part!!!!!!!
        // balance transfer to credit only deduct amount from debit -- do not update credit balance
        // try testing above users here ...



        //prabina works on credit card
        //you need to work on CreditCardService
        //Inherit CreditCard interface and implement all the methods
        // Do not touch Debit Card Part!!!!!!!
        // users are already created above
        // when issuing a new card you are giving the user default credit limit of $500\
        // when accepting Balance transfer from Debit -- do not update debit card balance
        //try testing different methods for above users


        //when both work combined - merge to main/master branch
        //transfer balance from debit to credit
        // same account
        //different account
        // show details to check if it worked properly
        //It should work only when both nikita and prabina complete thier parts





    }
}
