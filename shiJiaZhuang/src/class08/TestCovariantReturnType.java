package class08; //2016.7.18 星期一 am.1
//Override重写：重写是子类对父类的允许访问的方法的实现过程进行重新编写！返回值和形参都不能改变。即外壳不变，核心重写！
import class01.Person;
import class07.Student;
//声明A类
class A{
	public Person getAssistor(){
	    Person p = new Person();
	    return p;
	}
}
//声明B类并继承A类
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
//		输出“a::”和a指向的一个存储空间
		System.out.println("a::"+a.getAssistor());
//		输出stu对象的school属性
		System.out.println(stu.getSchool());
	}
}
