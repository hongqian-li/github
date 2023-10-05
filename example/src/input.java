//import java.util.Scanner;
//
//public class input {
//
//	@SuppressWarnings("resource")
//	public static void main(String[] args) {
//		
//		System.out.println("What is your name? ");
//		
//		Scanner in = new Scanner(System.in);
//		
//		String answer = in.nextLine();
//
//		System.out.println("How old are you? ");
//		
//		String age = in.nextLine();
//		
//		System.out.println("Your name is " + answer +  " and "  +  "you are " + age + " years old" + "." );
//	}
//
//}



//import java.util.Scanner;
//
//public class input {
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("First number?");
//		int num1 = in.nextInt();
//		
//		System.out.println("Last number?");
//		int num2 = in.nextInt();
//		
//
//        if (num1 < num2) {
//
//        	for (int i = num1; i <= num2; i++) {
//                System.out.println(i);
//            }
//        }
//		
//    }
//}

//import java.util.Scanner;
//
//public class input {
//    public static void main(String[] args) {
//    	
//        Scanner in = new Scanner(System.in);
//        System.out.print("How many rows?");
//        int numRows = in.nextInt();
//
//        for (int i = 1; i <= numRows; i++) {
//            for (int star = 1; star <= i; star++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

import java.util.Random;
import java.util.Scanner

public class input {
    public static void main(String[] args) {
    	
    	Random r = new Random();
    	Scanner in = new Scanner(System.in);
    	String palyAgain;
    	
    	do
    	{
    		System.out.println("Throwing the dice");
    		System.out.println(r.nextInt(7)+1);
    		System.out.println("Play again(y/n)?");
    		playAgain = in.nextline();
    		
    	}while (playAgain.equals("y"));
    	// playAgain == "y" won't work
    	
    	System.out.println("Thanks for playing");
    	
    }
}

