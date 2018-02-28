package class05;

public class TestWhileLoop {
	public static void main(String[] args){
		int i = 1;
		int result = 0;
//		While方法：当满足条件是进入循环体
		while(i<100){
			result +=i;
			i ++;
		}
		System.out.println(result);
		System.out.println(i);
			
	}

}
