package class12;//2016.7.20 ÐÇÆÚÈýam.4

import java.util.*;

public class TestDate {
	public static void main(String[] args) {
		Date d1 = new Date(1000);
		long time = d1.getTime();
		System.out.println(time);
		System.out.println(d1);
		
		Date d2 = new Date();
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
	}

}
