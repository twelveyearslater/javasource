package class04;

import java.util.*;
//ȡ���������ֵ
public class TestIf_Else {
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
//		����������
		int a = sc.nextInt();
		int b = sc.nextInt();
		int max;
//		ȡ����巽��
		if(a>b){
			max=a;
		}
		else{
			max=b;
		}
		System.out.println(max);
	}

}
