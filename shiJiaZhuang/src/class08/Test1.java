package class08;//2016.7.18 星期一 am.3
//声明C类
class C{
	public void m1(int i){
		System.out.println("Method m1 in class C,the value is "+i);
	}
	public void m2(int j){
		System.out.println("Method m1 in class C,the value is "+j);
	}
}
//声明E类
class E{
	public void m1(double d){
		System.out.println("重载m1方法："+d);
	}
	public void m2(int j){
		System.out.println("重写m2方法："+j);
	}
}
//声明Test1类
public class Test1 {
//	主方法
	public static void main(String[] args) {
//		构造并分配
		E d = new E();
//		因为d是E类的对象所以调用E类中的方法
		d.m1(3);
		d.m1(3.14);
		d.m2(5);
	}

}
