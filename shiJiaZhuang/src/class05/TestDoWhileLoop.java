package class05;

public class TestDoWhileLoop {
//	0+1+...+99�ļ��㷽��
	public static void main(String[] args){
		int i=100;
		int result = 0;
//		do-while��䣺�Ƚ���ѭ���壬�������������ǣ�����ѭ����
		do{
			result +=i;
			i++;
		}while(i<100);
		System.out.println(result);
		System.out.println(i);
	}

}
