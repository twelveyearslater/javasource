package class12;//2016.7.20 星期三am.3

public class TestWrapper {
	public static void main(String[] args){
		Integer t1 = new Integer(314);
//		Integer t2 = 111;          //一种赋值方法。
		int i = t1.intValue();
		System.out.println(i);
		System.out.println(t1.toString());
		System.out.println(Integer.toBinaryString(27));
		System.out.println(Integer.toOctalString(27));
		System.out.println(Integer.toHexString(27));
		i=Integer.parseInt("500");
		System.out.println(i);
	}

}
