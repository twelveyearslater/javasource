package class06;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
//		����as������洢�ռ�
		ArraySort as = new ArraySort();
//		����һ��һά����a
		int[] a = {6,23,45,12,-86,94,41};
//		���÷�����ӡ����
		as.showIntArr(a);
//		����ϵͳ�ķ�������������
		Arrays.sort(a);
//		��ӡ����a
		as.showIntArr(a);
//		��ӡ�س�
		System.out.println();
//		����һ��һλ�ַ�������s
		String[] s = {"Lias","ףӢ̨","Billy","Kacy","��ɽ��"};
//		���÷�����ӡ����
		as.showStringArr(s);
//		����ϵͳ�ķ�������������
		Arrays.sort(s);
//		���÷�����ӡ����
		as.showStringArr(s);
		}
	public void showIntArr(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
	public void showStringArr(String[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

}
