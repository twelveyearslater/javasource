package class08;//2016.7.18 ����һ am.3
//����C��
class C{
	public void m1(int i){
		System.out.println("Method m1 in class C,the value is "+i);
	}
	public void m2(int j){
		System.out.println("Method m1 in class C,the value is "+j);
	}
}
//����E��
class E{
	public void m1(double d){
		System.out.println("����m1������"+d);
	}
	public void m2(int j){
		System.out.println("��дm2������"+j);
	}
}
//����Test1��
public class Test1 {
//	������
	public static void main(String[] args) {
//		���첢����
		E d = new E();
//		��Ϊd��E��Ķ������Ե���E���еķ���
		d.m1(3);
		d.m1(3.14);
		d.m2(5);
	}

}
