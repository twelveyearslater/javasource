package class06;

public class TestContinue {
	public static void main(String[] args){
//		continue用于返回循环体下一步
		for(int i=1;i<=10;i++){
			if(i%3==0){
				continue;
			}
			System.out.println("i__"+i);
		}
	}

}
