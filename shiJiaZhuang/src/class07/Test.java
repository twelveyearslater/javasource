package class07;

public class Test {
	public static void main(String[] args) {
		Student s = new Student();    //�½�һ������Student���s����
		s.setName("Tom");       //�̳и���ķ���
		s.setAge(18);         //�̳и���ķ���
		s.setSchool("THU");     //�����б���ķ���
		System.out.println(s.getInfo() + "\nSchool: " + s.getSchool());
	}

}
