package class09;//2016.7.18 星期一 pm.2

public class Test1 {
	public static void main(String[] args) {
		double r=10;
//		调用共有类中的静态常量
		double s=2*MyTool.PI*r;
		System.out.println("半径为"+r+"的圆的周长为："+s);
		System.out.println(MyTool.getArea(30, 40));
	}

}
