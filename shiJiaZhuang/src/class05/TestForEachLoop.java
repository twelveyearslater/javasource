package class05;

public class TestForEachLoop {
	public static void main(String[] args){
		int[] a={3,5,78,12};
//		a�е�Ԫ���������ѭ����
		for(int k: a){
			System.out.println(k);
		}
//		�ȼ���
		int k;
		for(int i=0;i<a.length;i++){
			k = a[i];
			System.out.println(k);
		}
	}

}
