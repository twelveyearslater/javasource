package class05;

//面试笔试题常见的问题点
//int和float的转换出现精度损失
//浮点型的四舍五入的实现
//a+b默认返回一个int类型的整形

public class TestConversion {
	public static void main(String[] args){
		int i1=1234567891;
		float f=i1;
		System.out.println(f);      //合法，但仍可能存在精度误差
		double d1=i1;      //合法，不存在精度损失
		System.out.println(d1);
		double d2=3.99;
		int i2 = (int)(d2+0.5);
		System.out.println(i2);
		
		byte a = 3;    //合法
		byte b = 112;       //合法
//		byte c = 200;       //非法，超出表示数范围
//		byte d = a + b;       //非法。可能出现精度损失，加法运算默认返回一个整形
		int e = a + b;       //合法
		System.out.print(e);
		int k = 1299;
		byte b1 = (byte)k;    //非法可能存在精度损失
		System.out.print(b1);
	}

}
