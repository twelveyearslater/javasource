package class06;
//定义一个MyDate类，并且定义其中的变量
class MyDate {
	private int day;
	private int month;
	private int year;
//这是个MyDate的构造器

	public MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
//这是一个disbplay()方法，用于打印
	public void display() {
		System.out.println(day + "-" + month + "-" + year);
	}
}
//定义一个公有属性的TestArry2类
public class TestArray2 {
	public static void main(String[] args){
//		定义一个MyDate类的数组
		MyDate[] m;
		m = new MyDate[10];
		for(int i=0;i<m.length;i++){
//			分别构造且分配存储空间并赋值，然后打印
			m[i]=new MyDate(i+1, i+1, 1990+i);
			m[i].display();
		}
	}

}
