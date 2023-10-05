import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        // Please enter your first name
        System.out.println("First name?");
        Scanner in = new Scanner(System.in);
        String firstName = in.nextLine();

        // Please enter your last name
        System.out.println("Last name?");
        String lastName = in.nextLine();

        // Please enter your business domain name
        System.out.println("Business domain name?");
        String domain = in.nextLine();

        // Check if first name or last name are missing
        if (firstName.isEmpty() || lastName.isEmpty()) {
            System.out.println("Error! First and/or last name is missing.");
            // The program can just end.

        } else {
            //Call GenerateEmail and GenerateUsername methods
            generalEmail(firstName, lastName, domain);
            generalUsername(firstName, lastName);
        }

        // Close the Scanner
        in.close();

    }

        // Define the generalEmail method
    public static void generalEmail(String firstName, String lastName, String domain) {
       
        String email = firstName + "." + lastName + "@" + domain;
        email = email.toLowerCase();
        System.out.println(email);
    }

        // Define the generalUsername method
    public static void generalUsername(String firstName, String lastName) {
       
        String username = (firstName.substring(0, 4) + lastName.substring(lastName.length() - 4));
        username = username.toLowerCase();
        System.out.println(username);

    }
}