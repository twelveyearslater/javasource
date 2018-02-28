package class04;

public class TestIncrement {
	public static void main(String[] args){
		int i = 5,j;
//		i先自增1，再给j赋值
		j=++i;
		System.out.println("i="+i+"\tj="+j);
//		先给j赋值，i再自增1
		j=i++;
		System.out.println("i="+i+"\tj="+j);
//		优先级问题
		j=4 * i--;
		System.out.println("i="+i+"\tj="+j);
		j=4 * --i;
		System.out.println("i="+i+"\tj="+j);
	}

}
