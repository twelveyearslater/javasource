package class04;

class Person{
	private String name;
	private int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

public class TestShortCircuiting {
	public static void main(String[] args){
		Person p1=null;
		p1=new Person("dashuju",5);
//		�߼��������ʹ�ã����ҷ�
		if((p1!=null)&&(p1.getAge()>=10)){
			System.out.println("����ѧJava��");
		}
		else{
			System.out.println("û�����⣬����ѧJava��");
		}
	}

}
