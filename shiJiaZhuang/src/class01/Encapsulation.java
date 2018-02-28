package class01;
//用某类下的对象调用类中封装好的对象
//定义一个Encapsulation类
public class Encapsulation {
	public static void main(String[] args){
//		new一个person并分配存储空间
		Person person= new Person();
//		set方法
		person.setAge(34);		
		System.out.println(person.getAge()+"person");
//		set方法
		person.setAge(-3);
//		set方法
		person.setName("Tom");
//		get方法
		System.out.println(person.getName() + "|||" +person.getAge());
	}

}
