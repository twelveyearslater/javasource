package class04;

public class TestConcat {
	public static void main(String args[]){
		int i =300+5;
//		�ַ���������
		String s="Hello,"+"world";
//		�ַ���������
		s=s+"ʯ��ׯ";
		System.out.println(s);
//		�ַ���������
		s +="���ã�"+i+"��";
		System.out.println(s);
//		�ַ���������
		String sql ="select*from user where id ="+i;
		System.out.println(s);
		System.out.println("sql|||"+sql);
		}

}
