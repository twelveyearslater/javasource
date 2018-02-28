package class10;//2016.7.19 星期二 am.2
//运行后会抛出一个异常:数组上界异常
public class TestException {
	public static void main(String[] args) {
		String friends[]={"Lisa","Bily","Kessy"};
		for(int i=0;i<5;i++){
			System.out.println(friends[i]);
		}
		System.out.println("\nthis is the end");
	}

}
