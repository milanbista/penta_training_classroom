//
////You are tasked with building a simple Gmail-like registration system where users can register their emails and view the list of registered emails.
////1.	Each User has a unique email address and a password.
////2.	Use a Set to store registered email addresses to prevent duplicates.
////3.	The system should give the user two options:
////o	Add a new email: User can input their email, password, and name.
////o	Show all emails: Display all registered email addresses.
////4.	When selecting "Add email", ensure the email is unique. If the email already exists, notify the user.
////5.	Continue to prompt the user with these options until they choose to exit

package gmailRegistrationSystem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gmail {
    Set<Account> accounts = new HashSet<>();

    //add email method
    public void addNewEmail(String email) {
       // todo: check if email already exists
        System.out.println("Enter name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Enter password");
        String password = scan.next();

        Account account = new Account(email, password, name);
        accounts.add(account);
    }

    public void showEmails(){
        for(Account acc :accounts){
            System.out.println(acc.getEmail());
        }
    }
}




