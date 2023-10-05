//import java.util.Random; 
//import java.util.scanner;
//
//
//public class loops {
//
//	public static void main(String[] args) {
//		String[] words = { "loop" };
//		String phrase = String.join("", words);
//
//		for (int i = 0; i < 5; i++) {
//		    System.out.println(phrase);
//		}
//
//	}
//
//}

	
//public class loops {
//	public static void main(String[]args) {
//		
//		int counter = 0;
//		while (counter <5)
//			
//		{
//			System.out.println(counter);
//			counter++;
//		}
//	}
//}


//import java.util.Scanner;
//
//public class loops {
//    
//    public static void main(String[] args) {
//        
//        Scanner in = new Scanner(System.in);
//        
//        int num;
//        do {
//            System.out.println("Type number 3");
//            num = Integer.parseInt(in.nextLine());
//        } while (num != 3);
//        
//    }
//}


//public class loops {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		for(int i = 1; i < 6; i++)
//		{	
//			System.out.println(i);
//		}
//
//	}
//
//}



//public class loops {
//
//	public static void main(String[] args) {
//		String[] words = { "Round" };
//		String phrase = String.join("", words);
//
//		for (int i = 1; i < 11; i++) {
//		    System.out.println("Round " + i);
//		}
//
//	}
//
//}


import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("First number?");
		int num1 = in.nextInt();
		
		System.out.println("Last number?");
		int num2 = in.nextInt();
		

        if (num1 < num2) {

        	for (int i = num1; i <= num2; i++) {
                System.out.println(i);
            }
        }
		
    }
}



