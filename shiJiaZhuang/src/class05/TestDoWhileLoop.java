package class05;

public class TestDoWhileLoop {
//	0+1+...+99的计算方法
	public static void main(String[] args){
		int i=100;
		int result = 0;
//		do-while语句：先进入循环体，当不满足条件是，跳出循环体
		do{
			result +=i;
			i++;
		}while(i<100);
		System.out.println(result);
		System.out.println(i);
	}

}
