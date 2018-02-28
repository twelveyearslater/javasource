package class19;//2016.8.15.am1


import java.util.ArrayList;
import java.util.List;

public class TestAnnotation implements I_TestAnnotion{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList();
		list.add(0);
		TestAnnotation ta = new TestAnnotation();
		ta.doSomething();
	}
	@Override   //重写的注释
	@Deprecated   //以后可能会被消除的方法，建议不要使用
	public void doSomething(){
		System.out.println("这个方法最好别用");
	}
	

}
