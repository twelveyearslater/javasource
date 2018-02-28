package class10;//2016.7.19 星期二 am.5
//try catch 这是干什么的
//finally的代码十如何使用的
//finally final的区别
public class Test1 {
	public static void main(String[] args) {
		String friends[]={"Lisa","Bily","Kessy","aa","bb"};
		try{
			for(int i=0;i<5;i++){
				System.out.println(friends[i]);
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("index err");
			}
//		finally中的语句一定执行
		finally{
		System.out.println("must be use");
		}
		System.out.println("\nthis is the end");
	}
}
