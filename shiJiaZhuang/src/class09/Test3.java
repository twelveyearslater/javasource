package class09;//2016.7.18 ����һ pm.4

public class Test3 {
	private static int i=5;
	public void m1(){
		i++;
	}
	public void m2(){
		this.m1();
	}
	public static int m3(){
//		�Ƿ��ģ���̬�ķ������ܵ��ö�̬������
//		m1();
		m4();
		return i++;
	}
	public static void m4(){
		i++;
	}
	public static void main(String[] args) {
//	��̬�����������ܵ��ö�̬����
//		int b = Test3.m2();    �Ƿ���

		Test3 tt = new Test3();//ʵ������һ�����󣬴�ʱ�ö������ʵ���ھ�̬�������е��øö����������µķǾ�̬̫����
	    
		tt.m2();
	    int a = Test3.m3();
	    System.out.println(a);
	}

}
