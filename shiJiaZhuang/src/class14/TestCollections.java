package class14;//2016.7.21 ������am.1

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
		System.out.println("ԭ�б�"+alist);
		Collections.sort(alist);
		System.out.println("�����"+alist);
		Collections.reverse(alist);
		System.out.println("�����"+alist);
		ArrayList blist =new ArrayList();
		blist.add(55);
		blist.add(66);
		System.out.println("���б�"+blist);
		Collections.copy(alist, blist);
		System.out.println("������"+alist);
		System.out.println("�б��г���Ԫ��66�Ĵ�����"+Collections.frequency(alist, 66));
		System.out.println("�б��е����ֵ��"+Collections.max(alist));
		System.out.println("�б��е���Сֵ��"+Collections.min(alist));
	}

}
