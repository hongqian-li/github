//实现幸运观众的测试
//关于随机数字的生成，语法结构是： int random=(int)(Math.random()*10);
import java.util.*;

public class LuckyCustomer{
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		//请输入4位会员卡号
		System.out.println("Please enter your VIP number.");
		int num = in.nextInt();
		
		System.out.println("Your VIP number is: " + num);
		
		//分解获得会员卡的各位数字：
		int onesPlace = num % 10;
//		System.out.println("The digit in the ones place of your membership card is:" + onesPlace);
		int tensPlace = num / 10 % 10;
//		System.out.println("The digit in the tens place of your membership card is:" + tensPlace);
		int hundredsPlace = num / 100 % 10;
//		System.out.println("The digit in the hundreds place of your membership card is:" + hundredsPlace);
		int thousandsPlace = num / 1000;
//		System.out.println("The digit in the thousands place of your membership card is:" + thousandsPlace);
		
		
//		//计算各个位的数字之和
//		int sum = onesPlace+tensPlace+hundredsPlace+thousandsPlace;
//		System.out.println("\nThe sum of your VPN number is:" + sum);
//		
//		//判断用户是否中奖
//		String info = (sum>20) ? "Congratulations! VIP number" +num+" , you got an iphone!" : "Thank you!";
//		System.out.println(info);
		
		//会员卡百位数 = 系统随机数
		int random = (int)(Math.random()*10);
//		System.out.println(random); 面对客户群体时，这句话不能打印，自己测试时可以看看。
		if(onesPlace == random) {
			System.out.println("Congratulation! "+num+" got an gift!");
		}else {
			System.out.println("VIP "+num+" thank you!");
		}
		
	}
}