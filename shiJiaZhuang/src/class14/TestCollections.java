package class14;//2016.7.21 星期四am.1

import java.util.ArrayList;
import java.util.Collections;

public class TestCollections {
	public static void main(String[] args) {
		ArrayList alist= new ArrayList();
		alist.add(75);
		alist.add(38);
		alist.add(21);
		alist.add(4);
		alist.add(12);
		System.out.println("原列表："+alist);
		Collections.sort(alist);
		System.out.println("排序后："+alist);
		Collections.reverse(alist);
		System.out.println("逆序后："+alist);
		ArrayList blist =new ArrayList();
		blist.add(55);
		blist.add(66);
		System.out.println("新列表："+blist);
		Collections.copy(alist, blist);
		System.out.println("拷贝后："+alist);
		System.out.println("列表中出现元素66的次数："+Collections.frequency(alist, 66));
		System.out.println("列表中的最大值："+Collections.max(alist));
		System.out.println("列表中的最小值："+Collections.min(alist));
	}

}
