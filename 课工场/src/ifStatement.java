//1. 掌握基本if选择结构的语法和执行流程

//小宝java成绩大于90分，老师奖励他一部iPhone
//import java.util.Scanner;
//
//public class ifStatement {
//	
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter your grade.");
//		double score = in.nextDouble();
//		if(score>90){
//			System.out.println("Well done! Award an iPhone.");
//		}
//	}
//}

//小宝java成绩大于90分，并且（&&）音乐成绩大于80分时，或者（||）Java等于100分，音乐成绩大于70分时，老师奖励iPhone。
//import java.util.Scanner;
//
//public class ifStatement {
//	public static void main(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter your Java grade:");
//		double score1 = in.nextDouble();
//		System.out.println("\nPlease enter your Music grade:");
//		double score2 = in.nextDouble();
//		
//		if((score1>90 && score2>80)||(score1==100 && score2>70)) {
//			System.out.println("\nWell done! Award an iphone.");
//		}
//		
//	}
//}


//2. 掌握if-else选择结构的语法和执行流程
//如果小宝java考试成绩大于90分，老师奖励一部iPhone，否则老师惩罚。
//import java.util.Scanner;
//
//public class ifStatement {
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter your JAVA grade:");
//		Double grade = in.nextDouble();
//		
//		if(grade>90) {
//			System.out.println("Well done, I will award you an iphone!");
//		}else {
//			System.out.println("Punishment.");
//		}
//	}
//}
//if (grade<=90) {
//System.out.println("Punishment!");
//} 用两个if太复杂了... 所以接下来需要使用else。

//如果，那么，否则，那么
//选择结构体中，只有一句语句或者一个语句块，是可以删除{}的，但是不建议！！可读性太差，引发语法逻辑错误。
//		if (grade>90) 
//			if(5>6) 
//				System.out.println("Well done, I will award you an iPhone!");
//			else
//				System.out.println("Test");
//		else
//			System.out.println("Publishment!");
//		
//	}
//}

		

//3. 多重if选择结构的语法和执行流程//多重if条件一定要注意书写顺序！！！从小到大或者从大到小！否则可能影响执行逻辑结果
//import java.util.Scanner;
//
//public class ifStatement{
//	public static void main(String[] args) {
//		//成绩>=80 : good 
//		//成绩>=60 : pass
//		//成绩<60 :fail
//		Scanner in = new Scanner(System.in);
//		//多个if看起来繁琐，可读性差，执行效率低下且结果可能错误，所以用else if
//		System.out.println("Enter your grade:");
//		double grade = in.nextDouble();
//		
//		if(grade>80) {
//			System.out.println("Good");
//		}else if(grade>=60) {
//			System.out.println("Pass");
//		}else{
//			System.out.println("Fail");
//		}
//	}
//}
//购买汽车 >=500 Benz >=100 BMW >=50 Tesla >=10 <10 Bike
//
//public class ifStatement {
//
//	public static void main(String[] args) {
//		int money = 520; //万
//		if (money >=500){
//			System.out.println("Good job, I can buy Benz.");
//		}else if(money >=100){
//			System.out.println("Good job, I can buy BMW.");
//		}else if(money >=50){
//			System.out.println("Well, I can buy Tesla.");
//		}else if(money >=10){
//			System.out.println("Ok, I am gonna buy a bike then.");
//		}else {
//			System.out.println("Shit, I don't have money to buy car.");
//		}
//	}
//}

//4.嵌套if选择结构，用于区间段。
//
//import java.util.Scanner;
////示例1 举办运动会，百米赛跑跑入10秒内的学生有资格进决赛，根据性别分别进入男子组和女子组。
////字符串的比较使用 equals()，例如：sex.equals("boy");该例子都是Boolean类型。
//public class ifStatement {
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("How many second?");
//		double score = in.nextDouble();
//		
//		//成绩<10 进决赛，>10 淘汰；
//		if(score<10) {
//			//根据性别分组
//			System.out.println("Enter your gender:");
//			String gender = in.next();
//			if(gender.equals("Girl")){
//				System.out.println("Go to the girl group.");
//			}else if(gender.equals("boy")) {
//				System.out.println("Go to the boy group.");
//			}else{
//				System.out.println("Wrong information, Enter again.");
//			}
//		}else{
//			System.out.println("Out!");
//		}
//	}
//	
//}

////实现幸运观众的测试
////关于随机数字的生成，语法结构是： int random=(int)(Math.random()*10);
//import java.util.*;
//
//public class ifStatement {
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		
//		//请输入4位会员卡号
//		System.out.println("Please enter your VIP number.");
//		int num = in.nextInt();
//		
//		System.out.println("Your VIP number is: " + num);
//		
//		//分解获得会员卡的各位数字：
//		int onesPlace = num % 10;
////		System.out.println("The digit in the ones place of your membership card is:" + onesPlace);
//		int tensPlace = num / 10 % 10;
////		System.out.println("The digit in the tens place of your membership card is:" + tensPlace);
//		int hundredsPlace = num / 100 % 10;
////		System.out.println("The digit in the hundreds place of your membership card is:" + hundredsPlace);
//		int thousandsPlace = num / 1000;
////		System.out.println("The digit in the thousands place of your membership card is:" + thousandsPlace);
//		
//		
////		//计算各个位的数字之和
////		int sum = onesPlace+tensPlace+hundredsPlace+thousandsPlace;
////		System.out.println("\nThe sum of your VPN number is:" + sum);
////		
////		//判断用户是否中奖
////		String info = (sum>20) ? "Congratulations! VIP number" +num+" , you got an iphone!" : "Thank you!";
////		System.out.println(info);
//		
//		//会员卡百位数 = 系统随机数（0-10之间的整数，一定是大于等于0，小于10）
//		int random = (int)(Math.random()*10);
//		System.out.println(random);
//		if(onesPlace == random) {
//			System.out.println("Congratulation! "+num+" got an gift!");
//		}else {
//			System.out.println("VIP "+num+" thank you!");
//		}
//		
//	}
//}

//5.Switch选择结构(等值比较时！！！例如 第一 第二 第三进行比较。
//小宝参加计算机编程比赛，如果第一名，去夏令营，如果是第二名，笔记本电脑，如果是第三名，移动硬盘，如果没有每次则没有奖励。
//以下是啰嗦繁琐的 if else用法
//import java.util.Scanner;
//
//public class ifStatement  {
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("What's your ranking?");
//		int rank = in.nextInt(); //名次
//		if (rank == 1) {
//			System.out.println("Go to the camp.");
//		}else if(rank == 2) {
//			System.out.println("Get a laptop.");
//		}else if(rank == 3) {
//			System.out.println("Get a USB drive.");
//		}else {
//			System.out.println("You won't get anything.");
//		}
//	}
//	
//}

//以下是switch用法,常量表达式内只能用int，short，byte，char，枚举类型，String

//import java.util.Scanner;
//
//public class ifStatement {
//	
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("What's your ranking?");
//		int rank = in.nextInt();
//		//注意switch后面表达式的数据类型。每一个case记得加break，case后的常量不能相同，default需要注意执行顺序，可以随意改但是建议放最后。
//		switch (rank) {
//			case 1:
//				System.out.println("Join the summer camp.");
//				break;
//			case 2:
//				System.out.println("Award a new laptop.");
//				break;
//			case 3:
//				System.out.println("Award an USB drive.");
//				break;
//			default:
//				System.out.println("You got nothing.");
//				break;
//		} 
//	}
//}


// 总结！
// if 选择结构，包括以下形式
//1. 基本if选择结构，可以处理单一或者组合条件的情况
//2. if-else选择结构，可以处理简单的条件分支情况
//3. 多重if选择结构，可以处理分段的条件分支情况
//4. 嵌套if选择结构，可以处理复杂的条件分支情况

//Switch选择结构，多重分支并且条件判断是等值判断的情况。
//①读懂需求，②画流程图，③分析及转换为代码，④通过运行结果复盘调整代码排错总结经验

//一定要学会使用流程图分析问题！！






