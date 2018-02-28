package class10;//2016.7.19 ���ڶ� am.4
//�׳��쳣����ָ���쳣
class Person{
	public void display(Person p){
		@SuppressWarnings("unused")
		String s = new String("abc");
		System.out.println(p.age);	
	}
	public int age;
}

public class TestNullPointerException {
	@SuppressWarnings("null")
	public static void main(String[] args) {
//		һ�ο�ָ��
		Person p = null;
		System.out.println(p.age);
//		�ڶ��ο�ָ��
		new Person().display(null);
		
	}

}
