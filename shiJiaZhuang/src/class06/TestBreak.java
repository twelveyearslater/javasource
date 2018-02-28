package class06;

public class TestBreak {
	public static void main(String[] args){
		TestBreak tb = new TestBreak();
		boolean result = tb.isPrimeNumber(35);
		System.out.println(result);
	}
	public boolean isPrimeNumber(int n){
		boolean flag = true;
//		break用于结束一个循环体
		for(int i=2;i<n;i++){
			System.out.println("i::"+i);
			if(n%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

}
