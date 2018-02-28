package class01;
//定义一个公有的TestObject类
public class TestObject {
	public static void main(String[] args){
//		用Person()构造器new出p1、p2对象并分配存储空间
		Person p1 = new Person();
		Person p2 = new Person();
//		给p1的name、age属性直接赋值
		p1.name = "王二";
		p1.age = 18;
//		用set方法给p2对象的Name，Age属性赋值
		p2.setName("李三");
		p2.setAge(33);
//		用对象调用该类下的方法
		p1.sleep();
		p2.sleep();
//		用get方法得到p1的Age属性并打印出来
		System.out.println("王二的年龄是"+p1.getAge());		
//		直接调用p2对象的属性并打印
		System.out.println(p2.age);
	}
}
