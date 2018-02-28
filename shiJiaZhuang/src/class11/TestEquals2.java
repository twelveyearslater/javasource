package class11;//2016.7.19 星期二 pm.5

//在比较String类型对象时，“==”比较的是hashCode，“equals”比较的是它本身的值。

public class TestEquals2 {
	public static void main(String[] args) {
	String s1 = new String("abc");
	String s2 = new String("abc");
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
//	System.out.println(s1.hashCode());
//	System.out.println(s2.hashCode());
	s2 = s1;
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	}
}
