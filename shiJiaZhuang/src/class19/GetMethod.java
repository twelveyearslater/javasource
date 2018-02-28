package class19;//2016.8.15.am7

import java.lang.reflect.Method;

public class GetMethod {
	public static void main(String[] args) {
		try{
			Class c = Class.forName("java.util.List");
			Method m[] = c.getDeclaredMethods();
			for(int i=0;i<m.length;i++){
				System.out.println(m[i].toString());
				}
			System.out.println(m[9].toString());
			System.out.println(m[9]);
		}catch(Throwable e){
			System.err.println(e);
		}
	}
}
