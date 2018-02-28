package class05;

public class TestNestedLoop {
	public static void main(String[] args){
//		构造并分配存储空间
		TestNestedLoop tn = new TestNestedLoop();
//		调用m()方法赋值给total
		int total=tn.m(4);
		System.out.println(total);
	}
//	m()方法的过程
	public int m(int n){
		int result = 0;
//		for 语句的嵌套，按层执行
		for(int i=1;i<=n;i++){
			int temp = 1;
			for(int j=1;j<=i;j++){
				temp *= j;
			}
			result+=temp;
		}
		return result;
	}

}
