package class09;//2016.7.18 星期一 pm.8
//Person类通过继承Runner接口的方式，从而来继承接口的抽象方法。
public class Person implements Runner{
	public void start(){
		System.out.println("弯腰、开跑");
	}
	public void run(){
		System.out.println("摆动手臂，维持至直线方向");
	}
	public void stop(){
		System.out.println("减速直至停止，喝水");
	}
	
}

//重写接口中声明的方法时，需要注意以下规则：
//类在实现接口的方法时，不能抛出强制性异常，只能在接口中，或者继承接口的抽象类中抛出该强制性异常。
//类在重写方法时要保持一致的方法名，并且应该保持相同或者相兼容的返回值类型。
//如果实现接口的类是抽象类，那么就没必要实现该接口的方法。

//在实现接口的时候，也要注意一些规则：
//一个类可以同时实现多个接口。
//一个类只能继承一个类，但是能实现多个接口。
//一个接口能继承另一个接口，这和类之间的继承比较相似。


