package class02;
//定义一个公有的Person类,静态的变量age,total,无参及有参构造器和静态的getInfo方法
public class Person {
	public static int age=1;
	public static int total=1;
	public Person(){}
	public Person (int age){
		Person.age =age;
	
	}
	public static void getInfo(){
		System.out.println("age:"+age);
	}
}


