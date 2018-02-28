package class10;//2016.7.19 星期二 am.1
//定义常量都是： public static fianl.... 。
//枚举:可以把相关的常量分组到一个枚举类型里，而且枚举提供了比常量更多的方法。
enum Week{
	MON,TUE,WED,EHU,FRI,SAT,SUN
}
public class ListEnum {
	public static void main(String[] args) {
		Week oneday = Week.MON;
		Week[] days = Week.values();
		for(Week d:days){
			System.out.println(d);
		}
		System.out.println(oneday);
	}

}
