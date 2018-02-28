package class03;

public class TestPassingValue {
//	定义test()方法
	public void test(MyDate m){
		m.setDay(22);
	}
	public static void main(String[] args){
//		new对象
		MyDate d1=new MyDate(8,8,2008);
		d1.display();
//		声明对象并赋值
		MyDate d2=d1;
		d2.setYear(2009);
		
		d1.display();
		TestPassingValue tpv= new TestPassingValue();
		tpv.test(d2);
		d1.display();
	}

}
