package class08;//2016.7.18 ����һ am.4

//����һ��Person��
public class Person {
//	����˽�г�Ա����
	private String name;
//	��������
	int age;
//	������̬��Ա����
	public static int total=0;
//	����һ�����������Ĺ�����
	public Person(){
		
	}
//	����һ���������Ĺ�����
	public Person (String name,int age){
		this.name = name;
		this.age =age;
	}
//	��Ҳ��һ���������Ĺ�����(����)
	public Person(String name){
		this(name,18);
	}
//	��Ҳ��һ���������Ĺ�����(����)
	public Person(int age){
		this("Annoymous",age);
	}
//	����shouInfo()����
	public void showInfo(){
		System.out.println("Name:"+name+"\tage:"+age);
	}
//	���徲̬��getInfo()����
	public static void getInfo(){
		System.out.println("total:"+total);
	}
//	������
	public static void main(String[] args) {
		Person z =new Person("diudiudiu",18);
		z.showInfo();
	}
}
