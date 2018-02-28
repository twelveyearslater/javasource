package class06;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
//		构造as并分配存储空间
		ArraySort as = new ArraySort();
//		定义一个一维数组a
		int[] a = {6,23,45,12,-86,94,41};
//		调用方法打印数组
		as.showIntArr(a);
//		调用系统的方法给数组排序
		Arrays.sort(a);
//		打印数组a
		as.showIntArr(a);
//		打印回车
		System.out.println();
//		定义一个一位字符串数组s
		String[] s = {"Lias","祝英台","Billy","Kacy","梁山伯"};
//		调用方法打印数组
		as.showStringArr(s);
//		调用系统的方法给数组排序
		Arrays.sort(s);
//		调用方法打印数组
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
