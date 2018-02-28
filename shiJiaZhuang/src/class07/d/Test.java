package class07.d;

class Person {
}

class Student extends Person {

}

class Graduate extends Student {

}

class Tool {
	public void distribute(Person p) {
		//instanceof的作用是判断其左边对象是否为其右边类的实例，返回boolean类型的数据；可以用来判断继承中的子类的实例是否为父类的实现
		if (p instanceof Graduate) {
			System.out.println("处理Graduate类型及其子类类型对象！");
		} else if (p instanceof Student) {
			System.out.println("处理Student类型及其子类类型对象！");
		} else {
			System.out.println("处理Graduate类型及其子类类型对象");
		}
	}
}

public class Test {
	public static void main(String[] args) {
		Tool t = new Tool();
		Person graduate = new Student();
		t.distribute(graduate);
	}
}