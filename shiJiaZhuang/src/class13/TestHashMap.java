package class13;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(new Integer(1003),new Person(1003,"����",15));
		hm.put(new Integer(1008),new Person(1008,"����",25));
		hm.put(1015,new Person(1015,"����",73));
		hm.put(1001,new Person(1001,"����",49));
		hm.put(1001,new Person(1001,"����",99));
		System.out.println("----��������Ԫ��----");
		Person p = (Person)hm.get(1001);
		System.out.println(p);
		System.out.println("----��������\"��\"��Ԫ������----");
		Set names = hm.keySet();
		for(Object o : names){
			System.out.println(o);
		}
//		�������valueֵ���ݸ�List
//		List list = (List)hm.values();
//		for(int i=0;i<list.size();i++){
//			 Person q= (Person)list.get(i);
			 
		
		System.out.println("----��������\"��\"��Ԫ��ֵ��----");
		Collection values = hm.values();
		for(Object o: values){
			System.out.println(o);
		}
		
				
	}

}
