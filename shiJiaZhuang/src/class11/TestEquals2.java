package class11;//2016.7.19 ���ڶ� pm.5

//�ڱȽ�String���Ͷ���ʱ����==���Ƚϵ���hashCode����equals���Ƚϵ����������ֵ��

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
