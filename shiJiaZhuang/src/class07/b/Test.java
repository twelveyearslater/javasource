package class07.b;
//定义一个Animal类并定义一个变量i
class Animal {
	protected int i = 1;
}
//Person类继承Animal类并定义部分变量进行赋值
class Person extends Animal {
	protected int i = 2;
	private String name = "Tom";
	private int age = 9;
//定义在Person类中的getInfo()方法
	public String getInfo() {
		return "Name:" + name + "\tAge:" + age;
	}
//定义在Person类中的TestI()方法
	public void TestI() {
//		super.i是父类中的
		System.out.println(super.i);
		this.getInfo();
//		this.i是子类中的
		System.out.println(this.i);	
	}
}
//Student类继承Person类并定义部分变量且赋值
class Student extends Person {
	private int i = 3;
	private String school = "THU";
//	定义在Student类中的getInfo()方法
	public String getInfo() {
		return super.getInfo() + "\tSchool:" + school;
	}
//	定义在Student类中的testI()方法
	public void TestI() {
		System.out.println(super.i);
		System.out.println(i);
	}
}

public class Test {
	public static void main(String[] args) {
//		构造并分配存储空间
		Person p = new Person();
//		调用相应函数
		System.out.println(p.getInfo());
		p.TestI();
//		构造并分配存储空间
		Student s = new Student();
//		调用相应函数
		System.out.println(s.getInfo());
		s.TestI();
	}

}
