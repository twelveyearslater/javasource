package class10;//2016.7.19 星期二 am.8

public class TestAssert {
	public static void main(String[] args) {
		new TestAssert().process(12);
	}
	public void process(int age){
//		断言
		assert age<0:"年齡超出范围！";
//		if(age<0){
//			System.out.println("年龄超出范围！");
//		}
		System.out.println("您的年龄："+age);
	}

}
