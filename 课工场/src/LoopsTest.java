//import java.util.Scanner;
//
//public class LoopsTest {
//	
//	public static void main (String[] args) {
//		Scanner in = new Scanner(System.in);
//		int answer;
//		System.out.println("How many rows?");
//		answer  = in.nextInt();
//		
//		for(int i = 1; i <= answer - i; i++) {
//			for(int j = 1; j <= answer - i; j++) {
//				System.out.print(" ");
//			}
//			
//			for(int k = 1; k <=1; k++) {
//				System.out.print("*");
//			}
//			
//			System.out.println();
//		}
//		
//		in.close();
//	}
//}



//public class LoopsTest {
//	public static void main(String[] args) {
//		
//		for(int counter = 0; counter < 5; counter++) 
//		{
//		    System.out.println(counter + 1);
//		}
//
//	}
//}


////		语法结构为：
////		while(循环条件) {
////			
////			循环操作
////		}
//
//
//		//示例1 实现打印50份试卷
////		1.确定循环条件和循环操作
////		2.套用while语法写代码
////		3.检查循环是否可以退出去，比如i++;
//		
////public class LoopsTest {
////
////	public static void main(String[] args) {
////		//记录打印试卷的份数
////		int count = 1;
////		while(count <=50 ) {
////			System.out.println("Print page " + count + " paper");
////			
////			count++;
////		}
////	}
////
////}
//
////示例2，老师每天检查小宝的学习任务是否合格，如果不合格，则继续进行。
////老师给小宝安排的每天的任务是：
////上午阅读教材，学习理论知识，下午上机编程，掌握代码部分。
////import java.util.Scanner;
////
////public class LoopsTest {
////
////	public static void main(String[] args) {
////		String answer;//标识是否合格
////		Scanner input = new Scanner(System.in);
////		System.out.print("Did you pass?(y/n)");
////		answer = input.next(); //y pass，n fail
////		
////		while(!"y".equals(answer)) {
////			//执行学习任务
////			System.out.println("Do some readings in the morning.");
////			System.out.println("Do some coding work in the afternoon!");
////			//每次执行完学习任务，需要验证一下是否合格 -- 重要！保证有机会能跳出循环！
////			System.out.print("Did you pass?(y/n)");
////			answer = input.next();
////			
////		}
////		
////		//Pass y跳出循环，结束。
////		System.out.println("Well done!");
////	}
////
////}
//
//import java.util.Scanner;
//
//public class LoopsTest {
//	
//	public static void main(String[] args) {
//		String answer;
//		Scanner input = new Scanner(System.in);
//		System.out.print("Have you finished your homework?(y/n)");
//		answer = input.next();
//		
//		while(!"y".equals(answer)) {
//			
//			System.out.println("Keep going!");
//			System.out.print("Have you finished your homework?(y/n)");
//			answer = input.next();
//		}
//		
//		System.out.println("Good Job!");
//
//	}
//	
//}



//do while循环 特点是 先执行，再判断
//语法结构 do{
//
//           循环操作
//
//       }while(循环条件);

//import java.util.Scanner;
//
//public class LoopsTest{
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		String answer = "";//标识是否合格？
//		
//		do {
//			System.out.println("Do some coding!");
//			System.out.print("Did you pass it?(y/n)");
//			answer = input.next();
//		}while(!"y".equals(answer));
//		////或者while("n".equals(answer))
//		
//		//合格跳出循环
//		System.out.println("congratulations!");
//		
//	}
//	
//}


//while循环和do-while循环的区别
//语法不同，while是先判断后执行，Do while是先执行，后判断。
//其次 初始情况不满足循环条件时，while循环一次都不会执行，do-while循环不管任何情况都至少执行一次。
//举例说：while相当于你带刀坐地铁，安检就直接拒绝你进入，但是do-while是可以进去，但是出站会被安检。



//public class LoopsTest{
//	
//	public static void main(String[] args) {
//		
//		for(int num = 0; num < 5; num++)
//		{
//			System.out.println(num);
//		}
//		
//	}
//	
//}


//public class LoopsTest{
//	
//	public static void main(String[] args) {
//		
//		for(int num = 10; num < 21; num++)
//		{
//			System.out.println(num);
//		}
//	}
//
//}

//public class LoopsTest {
//    public static void main(String[] args) {
//        for (int i = 0; i <= 20; i++) {
//            if (i == 5 || i == 16 || i == 20) {
//                System.out.println(i);
//            }
//        }
//    }
//}

//public class LoopsTest {
//    public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            System.out.println("loop");
//        }
//    }
//}

//public class LoopsTest {
//    public static void main(String[] args) {
//    	for (int i = 0; i <= 10; i++) {
//    		System.out.print("*");
//    	}
//
//    }
//}


//public class LoopsTest {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("Round " + i);
//        }
//    }
//}



import java.util.Random;

public class LoopsTest {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();

        // Generate and print three random numbers between 1 and 10
        int[] randomNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            randomNumbers[i] = random.nextInt(10) + 1; // Generates a random number between 1 and 10
            System.out.println("Random Number " + (i + 1) + ": " + randomNumbers[i]);
        }

        // Check if one of the numbers is 7 and print the result
        boolean hasSeven = false;
        for (int number : randomNumbers) {
            if (number == 7) {
                hasSeven = true;
                break;
            }
        }

        if (hasSeven) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost.");
        }
    }
}
