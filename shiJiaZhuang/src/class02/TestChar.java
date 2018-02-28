package class02;

public class TestChar {
	public static void main(String[] args){
		char c1 = 'a';
//		定义一个字符c2变量并用unicode的形式赋值
		char c2='\u0045';
//		定义一个字符变量c2并用转义字符赋值
		char c3='\n';
		System.out.println(c1);
		System.out.println("first");
		System.out.println(c2);
		System.out.println("second");
		System.out.println(c3);
//		\的打印方法
		System.out.print('\\');
		System.out.print(c3);
		System.out.print("end");
			
	}

}
