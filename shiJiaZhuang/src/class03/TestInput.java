package class03;

import java.util.Scanner;

public class TestInput {
	public static void main(String[] args){
//		new一个Scanner的对象s
		Scanner s =new Scanner(System.in);
		System.out.println("请输入您的名字:");
//		将下一行的文字赋值给name变量
		String name=s.nextLine();
		System.out.println("请输入您的年龄:");
//		将下一行的int类型的值赋值给age变量
		int age= s.nextInt();
		System.out.println("请输入您的爱好:");
//		将下一行的int类型的值赋值给age变量
		String favor=s.next();
		System.out.println("请输入您的收入:");
//		抢一下行的Double类型的值付给salary变量
		double salary=s.nextDouble();
		
		System.out.println("您的名字是" + name + "\t您的年龄是" + age + "您的收入是\t"+ salary +"Ԫ"+"\t您的爱好是" + favor);
	}
}