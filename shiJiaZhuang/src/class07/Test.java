package class07;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();    //新建一个属于Student类的s对象，
		s.setName("Tom");       //继承父类的方法
		s.setAge(18);         //继承父类的方法
		s.setSchool("THU");     //子类中本身的方法
		System.out.println(s.getInfo() + "\nSchool: " + s.getSchool());
	}

}
