package class09;//2016.7.18 ����һ pm.11
//������ͽӿڵĲ�ͬ�㣺
//�ӿ���ĳ�Ա���ԣ�Ĭ��Ϊ��̬�ģ�����������Ǻ�������һ����
//������ֻ�ܱ��̳У�����ֻ�ܼ̳�һ�������࣬�ӿڿ���ʵ���������
//�ӿ���ķ���Ĭ��Ϊ���󷽷�����������ķ������������Ϊ���󷽷�������Ҫ�з�����
abstract class AbSwimmer{
	public static int sw=222;
	public void swim(){
		
	}
}
interface Swimmer{
	public int sw=111;
//	public static int sw=111;
	public void swim();
//	public abstract void swim();
}
public class Test5 {
	public static void main(String[] args) {
		System.out.println(Swimmer.sw);
		System.out.println(AbSwimmer.sw);
	}

}
