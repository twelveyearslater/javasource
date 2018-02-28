package class07.b;
//����һ��Animal�ಢ����һ������i
class Animal {
	protected int i = 1;
}
//Person��̳�Animal�ಢ���岿�ֱ������и�ֵ
class Person extends Animal {
	protected int i = 2;
	private String name = "Tom";
	private int age = 9;
//������Person���е�getInfo()����
	public String getInfo() {
		return "Name:" + name + "\tAge:" + age;
	}
//������Person���е�TestI()����
	public void TestI() {
//		super.i�Ǹ����е�
		System.out.println(super.i);
		this.getInfo();
//		this.i�������е�
		System.out.println(this.i);	
	}
}
//Student��̳�Person�ಢ���岿�ֱ����Ҹ�ֵ
class Student extends Person {
	private int i = 3;
	private String school = "THU";
//	������Student���е�getInfo()����
	public String getInfo() {
		return super.getInfo() + "\tSchool:" + school;
	}
//	������Student���е�testI()����
	public void TestI() {
		System.out.println(super.i);
		System.out.println(i);
	}
}

public class Test {
	public static void main(String[] args) {
//		���첢����洢�ռ�
		Person p = new Person();
//		������Ӧ����
		System.out.println(p.getInfo());
		p.TestI();
//		���첢����洢�ռ�
		Student s = new Student();
//		������Ӧ����
		System.out.println(s.getInfo());
		s.TestI();
	}

}
