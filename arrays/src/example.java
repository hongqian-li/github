//public class example {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int[]numbers = {2,3,4,55,58};
//		
//		for(int i = 0; i < numbers.length ; i++ )
//		{
//			System.out.println(numbers[i]);
//		}
//	}
//
//}
//


import java.util.Scanner;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int[]numbers = new int[4];
		
		for(int i = 0; i < numbers.length ; i++ )
		{
			System.out.println("Write 1.number");
			numbers[i] = Integer.parseInt(in.nextLine());
		}
		
		System.out.println("Numbers are: ");
		

	}
}
