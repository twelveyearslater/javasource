package class06;

public class TestContinue {
	public static void main(String[] args){
//		continue���ڷ���ѭ������һ��
		for(int i=1;i<=10;i++){
			if(i%3==0){
				continue;
			}
			System.out.println("i__"+i);
		}
	}

}