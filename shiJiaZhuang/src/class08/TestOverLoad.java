package class08;  //2016.7.18 星期一 am.2
//  重载OverLoad:重载(overloading) 是在一个类里面，方法名字相同，而参数不同。返回类型呢？可以相同也可以不同。
//	每个重载的方法（或者构造函数）都必须有一个独一无二的参数类型列表.只能重载构造函数
class Tool{ 
	public void display(int i){
		System.out.println("输出整数："+i);
	}
	public void display(double d){
		System.out.println("输出浮点数："+d);
	}
	public void display(String s){
		System.out.println("输出文本："+s);
	}
	public void display(String s,int i){
		System.out.println("输出文本："+s);
	}
}
public class TestOverLoad {
	public static void main(String[] args) {
		Tool t = new Tool();
		t.display(3);
		t.display(3.14);
		t.display("Hello,你好！");
		t.display("WTF",2333333);
		
	}

}
