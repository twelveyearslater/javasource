package class05;

public class TestForEachLoop {
	public static void main(String[] args){
		int[] a={3,5,78,12};
//		a中的元素逐个进入循环体
		for(int k: a){
			System.out.println(k);
		}
//		等价于
		int k;
		for(int i=0;i<a.length;i++){
			k = a[i];
			System.out.println(k);
		}
	}

}
