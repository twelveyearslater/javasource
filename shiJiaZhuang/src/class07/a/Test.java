package class07.a;
//定义一个Person类，变量只有age以及具体方法
class Person{
	int age =5;
	public int getAge(){
		return age;
	}
	public int getInfo(){
		return age;
	}
}
//Student类继承Person类
class Student extends Person{
	int age =6;
	public int getAge(){
		return age;
	}
}
//定义一个class类
public class Test {
	public static void main(String[] args) {
		
		Person p = new Person();
//		仅仅为了说明子类可以用父类的方法
		System.out.println(p.getAge());
		
		Student s = new Student();
		System.out.println(s.age);
		System.out.println(s.getAge());
		System.out.println(s.getInfo());
	}

}
