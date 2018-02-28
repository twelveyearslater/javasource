package class04;

public class TestConcat {
	public static void main(String args[]){
		int i =300+5;
//		字符串的链接
		String s="Hello,"+"world";
//		字符串的链接
		s=s+"石家庄";
		System.out.println(s);
//		字符串的链接
		s +="您好，"+i+"号";
		System.out.println(s);
//		字符串的链接
		String sql ="select*from user where id ="+i;
		System.out.println(s);
		System.out.println("sql|||"+sql);
		}

}
