package class04;

import java.util.*;
//取两数的最大值
public class TestIf_Else {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
//		输入两个数
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
//		取大具体方法
		if(a>b){
			max=a;
		}
		else{
			max=b;
		}
		System.out.println(max);
	}

}
