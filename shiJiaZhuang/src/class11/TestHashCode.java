package class11;//2016.7.19 星期二 pm.3

public class TestHashCode {
	public static void main(String[] args) {
		Person p1 = new Person(18);
		Person p2 = new Person(18);
		Person p3 = p1;
//		哈希值
		int handle1 = p1.hashCode();
		System.out.println(handle1);
//		整型十进制转十六进制
		System.out.println(Integer.toHexString(handle1));
		System.out.println(p1);
		System.out.println("----------------------");
		System.out.println(p2.hashCode());
		System.out.println("----------------------");
		System.out.println(p3.hashCode());
	}

}
