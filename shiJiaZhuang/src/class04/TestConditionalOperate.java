package class04;

import java.util.Scanner;

public class TestConditionalOperate {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ٷ��Ƴɼ���");
//		��ȡһ��int����
		int score = scanner.nextInt();
//		if������һ��д��
		String result = (score >= 60)?"����":"������";
		//�ȼ��������д��
		if(score>=60){
			result = "����";
		}
		else{
			result ="������";
		}
		System.out.println(result);
	}

}
