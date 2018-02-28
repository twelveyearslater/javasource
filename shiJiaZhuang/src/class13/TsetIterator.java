package class13;

import java.util.ArrayList;
import java.util.Iterator;

public class TsetIterator {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("China");
		a.add("USA");
		a.add("Korea");
		a.add("Japen");
		Iterator it = a.iterator();
		while(it.hasNext()){
//			从it里取出一个元素
			String country = (String)it.next();
			System.out.println(country);
		}
	}
}
       
