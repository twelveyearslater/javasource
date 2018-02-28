package class19;//2016.8.15.pm2

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		int[] a = new int[3];
		int[] b = new int[]{4,5,5};
		int[][] c = new int[3][2];
		String[] d = new String[]{"jjj","kkk"};
		System.out.println(a==b);
		System.out.println(a.getClass()==b.getClass());
//		System.out.println(a.getClass()=d.getclass());    //比较字节码a和cd也没法比
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getSuperclass());
		System.out.println(d.getClass().getSuperclass());
		System.out.println();

		//由于父类都是Object,下面都是可以的
		Object obj1 = a;
		Object obj2 = b;
		Object[] obj3 = c;//基本类型的一维数组只可以当做Object，还可以当做Object[]
		Object obj4 = d;
		
		System.out.println(Arrays.asList(b));
		System.out.println(Arrays.asList(d));
	
	}
	

}
