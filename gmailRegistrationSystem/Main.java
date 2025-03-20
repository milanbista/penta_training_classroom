package gmailRegistrationSystem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Gmail mail = new Gmail();

        boolean run = true;
        while (run) {
            //Use a Set to store registered email addresses to prevent duplicates.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select from the following option");
            System.out.println("Option 1 to enter new email");
            System.out.println("Option 2 to show all emails");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.println("Enter email: ");
                String email = scanner.next();
                mail.addNewEmail(email);
            } else if (input == 2) {
                mail.showEmails();
            } else {
                System.out.println("Bye!");
                run = false;
            }
        }
    }
}
