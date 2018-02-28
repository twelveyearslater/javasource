package class04;

import java.util.Scanner;

public class TestConditionalOperate {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入百分制成绩：");
//		读取一个int数据
		int score = scanner.nextInt();
//		if语句的另一种写法
		String result = (score >= 60)?"及格":"不及格";
		//等价于下面的写法
		if(score>=60){
			result = "及格";
		}
		else{
			result ="不及格";
		}
		System.out.println(result);
	}

}
