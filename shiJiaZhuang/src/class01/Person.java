package class01;
//定义一个共有的Person类
public class Person {
//	声明一个共有的字符串对象并赋初值为小明
	public String name = "小明";
//	声明一个共有的int类型的变量
	public int age;
//	定义一个Person的有参构造器方法
	public Person(String string){
		this.name=string;
	}
//	定义一个无惨的Person的构造方法
	public Person(){
	}
//	定义一个无返回值的sleep函数
	public void sleep(){
		System.out.println(name + "��˯���������࣡");
	}
//	getName的方法可以自动生成
	public String getName() {
		return name;
	}
//	setName的方法也可以自动生成
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//	定义一个共有的返回值为String对象的getInfo方法
	public String getInfo() {
		return "Name:" + name + "\tAge:" + age;
	}
}
