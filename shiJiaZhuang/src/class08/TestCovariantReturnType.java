package class08; //2016.7.18 ����һ am.1
//Override��д����д������Ը����������ʵķ�����ʵ�ֹ��̽������±�д������ֵ���βζ����ܸı䡣����ǲ��䣬������д��
import class01.Person;
import class07.Student;
//����A��
class A{
	public Person getAssistor(){
	    Person p = new Person();
	    return p;
	}
}
//����B�ಢ�̳�A��
class B extends A{
	public Student getAssistor(){
		Student s =new Student();
		s.setName("Nancy");
		s.setAge(18);
		s.setSchool("THU");
		return s;
	}
}

public class TestCovariantReturnType {  
	public static void main(String[] args) {
		B b = new B();
		Student stu = b.getAssistor();
		
		A a = new A();
//		�����a::����aָ���һ���洢�ռ�
		System.out.println("a::"+a.getAssistor());
//		���stu�����school����
		System.out.println(stu.getSchool());
	}
}
