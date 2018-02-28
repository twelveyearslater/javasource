package class05;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade;
//	    if-if else-else的一种用法
		if(score >= 90){
			grade = 'A';
		}else if(score >= 80){
			grade = 'B';
		}else if(score >= 70){
			grade = 'C';
		}else if(score >= 60){
			grade = 'D';
		}else{
			grade = 'E';
		}
		System.out.println("Grade="+grade);
	}

}

