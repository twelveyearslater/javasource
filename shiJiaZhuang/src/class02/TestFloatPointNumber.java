package class02;

public class TestFloatPointNumber {
	public static void main(String[] args){
		double d1 = 15000.34;
		double d2 = 1.24e2;
		System.out.println(d1);
		System.out.println(d2);
		double c3= 3.0/0;
//		正无穷
		System.out.println(c3);
//		负无穷
		System.out.println(-3/0.0);
//		not a number
		System.out.println(0.0/0);
//		强行转换且java中没有四舍五入
		float f1 = (float)3.12345678901;
		System.out.println("f1\r"+f1);
	}

}
