package class06;

public class TestMultiDimensionalArray {
	public static void main(String[] args){
//		����һ����ά���������飬û�и�ֵ��λ��Ϊ�գ����Գ�Ϊ�������ά����
		int[][] a = {{1,2},{3,4,0,9,2,3},{5,6,7}};
//		����tmda������洢�ռ�
		TestMultiDimensionalArray tmda = new TestMultiDimensionalArray();
//		���÷�����ӡ��ά����a
		tmda.show(a);
		
		System.out.println("-----------------------------");
//		����һ��2��3�е����ζ�ά����
		int[][]b = new int[2][3];
//		��ֵ��û�и�ֵ��ֵĬ��Ϊ��
		b[1][0] = 4;
		b[1][1] = 5;
		b[1][2] = 6;
//		��ӡ����b
		tmda.show(b);
	}
//	��ӡ��ά����ķ�����ps�����еĴ�ӡ���������г��̵ı�ʾ������
	public void show(int[][] s){
		for(int i=0;i<s.length;i++){
			for(int j=0;j<s[i].length;j++){
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}

}
