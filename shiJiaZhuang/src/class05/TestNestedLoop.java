package class05;

public class TestNestedLoop {
	public static void main(String[] args){
//		���첢����洢�ռ�
		TestNestedLoop tn = new TestNestedLoop();
//		����m()������ֵ��total
		int total=tn.m(4);
		System.out.println(total);
	}
//	m()�����Ĺ���
	public int m(int n){
		int result = 0;
//		for ����Ƕ�ף�����ִ��
		for(int i=1;i<=n;i++){
			int temp = 1;
			for(int j=1;j<=i;j++){
				temp *= j;
			}
			result+=temp;
		}
		return result;
	}

}
