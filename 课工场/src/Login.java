

import java.util.Scanner;

public class Login {



public static void main(String[] args) {

// TODO Auto-generated method stub

Scanner scanner = new Scanner(System.in);



int tries = 0;



while(true) {

tries++;



System.out.println("Enter your first name(4 characters minimum)");

String firstName = scanner.nextLine();

System.out.println("Enter your last name (4 characters minimum)");

String lastName = scanner.nextLine();



// DATA VALIDATION TO CHECK FIRSTNAME IF LASTNAME FIELD ARE EMPTY



if (firstName.equals("")||lastName.equals("")) {

System.out.println(("Error! first and/orlastname is empty"));

break;

} else if(firstName.length()<4||lastName.length()<4) {

System.out.println("Error! First and/or last name is less than 4 characters");

break;

}

System.out.println("Enter your company domain");

String companyDomain = scanner.nextLine();

System.out.println(EmailGenerator((firstName), (lastName), (companyDomain)));

System.out.println(GenerateUsername(firstName, lastName));

break;

}

}



// METHOD FOR GENERATING EMAIL ADDRESS



public static String EmailGenerator(String firstName, String lastName, String companyDomain) {

String Email = firstName + lastName + "@"+companyDomain;

//



return Email;

}





// METHOD FOR GENERATING USERNAME



public static String GenerateUsername(String firstName, String lastName) {

if(firstName.length()>4 && lastName.length()>4) {

String firstPart = firstName.substring(0, 4).toLowerCase();

String secondPart = lastName.substring(lastName.length() - 4).toLowerCase();

return firstPart + secondPart;

}

else {

return "IVALIDUSERNAME";

}



}





}



