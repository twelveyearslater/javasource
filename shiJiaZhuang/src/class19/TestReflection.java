package class19;//2016.8.15.am8

public class TestReflection {
	public static void main(String[] args) {
		String str = "abc";
		@SuppressWarnings("rawtypes")
		Class cls1 = str.getClass();
		@SuppressWarnings("rawtypes")
		Class cls2 = String.class;
		@SuppressWarnings("rawtypes")
		Class cls3 = null;
		try {
			cls3 = Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(cls1==cls2);
		System.out.println(cls1==cls3);
		//判断cls1是不是基本数据类型
		System.out.println(cls1.isPrimitive());
		//判断int是不是基本数据类型
		System.out.println(int.class.isPrimitive());
		//判断int是不是integer对象
		System.out.println(int.class == Integer.class);
        //判断int是不是Integer对象强制装换数据类型后的数据类型
		System.out.println(int.class == Integer.TYPE);
		//判断int数组是不是基本数据类型
		System.out.println(int[].class.isPrimitive());
		//判断int数组是不是数组
		System.out.println(int[].class.isArray());
		
	}

}
