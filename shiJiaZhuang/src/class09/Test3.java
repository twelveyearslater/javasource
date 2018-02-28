package class09;//2016.7.18 星期一 pm.4

public class Test3 {
	private static int i=5;
	public void m1(){
		i++;
	}
	public void m2(){
		this.m1();
	}
	public static int m3(){
//		非法的，静态的方法不能调用动态的内容
//		m1();
		m4();
		return i++;
	}
	public static void m4(){
		i++;
	}
	public static void main(String[] args) {
//	静态的主方法不能调用动态方法
//		int b = Test3.m2();    非法。

		Test3 tt = new Test3();//实例化了一个对象，此时该对象可以实现在静态主方法中调用该对象所在类下的非静态太方法
	    
		tt.m2();
	    int a = Test3.m3();
	    System.out.println(a);
	}

}
