package class13;

import java.util.*;
//ע��������������Ϊ��������������࣬���Ϸ���������Ϊ�����������������
//Deprecated
//Override
public class TestDeprecation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date now = new Date();
//		 @Deprecated��������ע�ͱ�ʾ�����ķ��������п��ܻ�������
		int hour = now.getHours();
		System.out.println(hour);
		
		
		
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void list(){
		List list =new ArrayList();
		list.add(0);
		System.out.println(list.get(0));
	}

}
