package class07.a;
//����һ��Person�࣬����ֻ��age�Լ����巽��
class Person{
	int age =5;
	public int getAge(){
		return age;
	}
	public int getInfo(){
		return age;
	}
}
//Student��̳�Person��
class Student extends Person{
	int age =6;
	public int getAge(){
		return age;
	}
}
//����һ��class��
public class Test {
	public static void main(String[] args) {
		
		Person p = new Person();
//		����Ϊ��˵����������ø���ķ���
		System.out.println(p.getAge());
		
		Student s = new Student();
		System.out.println(s.age);
		System.out.println(s.getAge());
		System.out.println(s.getInfo());
	}

}
