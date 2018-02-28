package class07.d;

class Person {
}

class Student extends Person {

}

class Graduate extends Student {

}

class Tool {
	public void distribute(Person p) {
		//instanceof���������ж�����߶����Ƿ�Ϊ���ұ����ʵ��������boolean���͵����ݣ����������жϼ̳��е������ʵ���Ƿ�Ϊ�����ʵ��
		if (p instanceof Graduate) {
			System.out.println("����Graduate���ͼ����������Ͷ���");
		} else if (p instanceof Student) {
			System.out.println("����Student���ͼ����������Ͷ���");
		} else {
			System.out.println("����Graduate���ͼ����������Ͷ���");
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