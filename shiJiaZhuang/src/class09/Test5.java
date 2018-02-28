package class09;//2016.7.18 星期一 pm.11
//抽象类和接口的不同点：
//接口里的成员属性，默认为静态的，抽象类里的是和其他类一样的
//抽象类只能被继承，并且只能继承一个抽象类，接口可以实现无数多个
//接口里的方法默认为抽象方法，抽象类里的方法如果不声明为抽象方法，必须要有方法体
abstract class AbSwimmer{
	public static int sw=222;
	public void swim(){
		
	}
}
interface Swimmer{
	public int sw=111;
//	public static int sw=111;
	public void swim();
//	public abstract void swim();
}
public class Test5 {
	public static void main(String[] args) {
		System.out.println(Swimmer.sw);
		System.out.println(AbSwimmer.sw);
	}

}
