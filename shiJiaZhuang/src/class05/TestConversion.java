package class05;

//���Ա����ⳣ���������
//int��float��ת�����־�����ʧ
//�����͵����������ʵ��
//a+bĬ�Ϸ���һ��int���͵�����

public class TestConversion {
	public static void main(String[] args){
		int i1=1234567891;
		float f=i1;
		System.out.println(f);      //�Ϸ������Կ��ܴ��ھ������
		double d1=i1;      //�Ϸ��������ھ�����ʧ
		System.out.println(d1);
		double d2=3.99;
		int i2 = (int)(d2+0.5);
		System.out.println(i2);
		
		byte a = 3;    //�Ϸ�
		byte b = 112;       //�Ϸ�
//		byte c = 200;       //�Ƿ���������ʾ����Χ
//		byte d = a + b;       //�Ƿ������ܳ��־�����ʧ���ӷ�����Ĭ�Ϸ���һ������
		int e = a + b;       //�Ϸ�
		System.out.print(e);
		int k = 1299;
		byte b1 = (byte)k;    //�Ƿ����ܴ��ھ�����ʧ
		System.out.print(b1);
	}

}
