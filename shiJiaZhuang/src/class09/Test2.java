package class09;//2016.7.18 星期一 pm.3

public class Test2 {
	public final String country = "China";
	private static int totalNumber = 1000;
	private final int id;
	
	public Test2(){
		id=++totalNumber;
	}
	public int getId(){
		return id;
	}
	public int getTotalNumber(){
		return totalNumber;
	}
	public static void main(String[] args){
		Test2 t = new Test2();
		System.out.println(t.country + "\t" + t.getId());
		final int i=10;
		final int j;
		j=20;
//		j=30;   final修饰的变量位常量只能赋值一次
		
		System.out.println(j+"\t"+i);
		}

}
