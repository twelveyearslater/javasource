package class10;//2016.7.19 ���ڶ� am.8

public class TestAssert {
	public static void main(String[] args) {
		new TestAssert().process(12);
	}
	public void process(int age){
//		����
		assert age<0:"���g������Χ��";
//		if(age<0){
//			System.out.println("���䳬����Χ��");
//		}
		System.out.println("�������䣺"+age);
	}

}
