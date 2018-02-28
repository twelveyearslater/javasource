package class13;

import java.util.*;
//注解加载类的上面是为了描述我们这个类，加上方法上面是为了描述我们这个方法
//Deprecated
//Override
public class TestDeprecation {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date now = new Date();
//		 @Deprecated：这样的注释表示这样的方法将来有可能会消除。
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
