package class03;

public class TestMethod {
//	求和方法
	public int m1(int a,int b, int c){
		int result=a+b+c;
		return result;
	}
//	输出输入的
	public void m2(int c){
		System.out.println(c);
	}
	public static void main(String[] args){
//		new一个tm对象
		TestMethod tm =new TestMethod();
		int j=tm.m1(3, 4, 5);
		System.out.println(j);
		System.out.println(tm.m1(100, 10, 9));
		tm.m1(1, 2, 3);
		tm.m2(6);
	}

}
