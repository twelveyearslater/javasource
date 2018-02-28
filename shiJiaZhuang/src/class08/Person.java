package class08;//2016.7.18 星期一 am.4

//定义一个Person类
public class Person {
//	声明私有成员变量
	private String name;
//	声明变量
	int age;
//	声明静态成员变量
	public static int total=0;
//	这是一个不含参数的构造器
	public Person(){
		
	}
//	这是一个含参数的构造器
	public Person (String name,int age){
		this.name = name;
		this.age =age;
	}
//	这也是一个含参数的构造器(重载)
	public Person(String name){
		this(name,18);
	}
//	这也是一个含参数的构造器(重载)
	public Person(int age){
		this("Annoymous",age);
	}
//	定义shouInfo()方法
	public void showInfo(){
		System.out.println("Name:"+name+"\tage:"+age);
	}
//	定义静态的getInfo()方法
	public static void getInfo(){
		System.out.println("total:"+total);
	}
//	主函数
	public static void main(String[] args) {
		Person z =new Person("diudiudiu",18);
		z.showInfo();
	}
}
