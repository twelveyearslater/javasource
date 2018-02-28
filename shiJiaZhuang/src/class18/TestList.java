package class18;//2016.8.12.pm8

import java.util.ArrayList;

public class TestList {
	public static void main(String[] args) {
//		List list = new ArrayList<E>();
		ArrayList<String> listStr = new ArrayList<String>();
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		ArrayList<Object> listObj = new ArrayList<Object>();
		Object o = new Object();
		
//		listStr.add(111);    //非法
		listStr.add("111");
		
		listInt.add(111);
//		listInt.add("111");   //非法
		
		listObj.add(111);
		listObj.add("111");
		
//		listStr.add(o);   //非法
//		listInt.add(o);   //非法
		
		
		
	}

}
