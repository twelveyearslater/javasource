package class08;  //2016.7.18 ����һ am.2
//  ����OverLoad:����(overloading) ����һ�������棬����������ͬ����������ͬ�����������أ�������ͬҲ���Բ�ͬ��
//	ÿ�����صķ��������߹��캯������������һ����һ�޶��Ĳ��������б�.ֻ�����ع��캯��
class Tool{ 
	public void display(int i){
		System.out.println("���������"+i);
	}
	public void display(double d){
		System.out.println("�����������"+d);
	}
	public void display(String s){
		System.out.println("����ı���"+s);
	}
	public void display(String s,int i){
		System.out.println("����ı���"+s);
	}
}
public class TestOverLoad {
	public static void main(String[] args) {
		Tool t = new Tool();
		t.display(3);
		t.display(3.14);
		t.display("Hello,��ã�");
		t.display("WTF",2333333);
		
	}

}
