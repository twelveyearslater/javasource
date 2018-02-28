package class04;

public class TestNestIf {
	public static void main(String[] args){
		TestNestIf tni = new TestNestIf();
		int result = tni.max(3,4,5);
		System.out.println(result);
	}
//	利用if语句实现三数取大
	public int max(int a,int b,int c){
		int max;
		if(a>b){
			max=a;
		}
		else{
			max=b;
		}
		if(max>c){
		}
		else{
			max=c;
		}
		return max;
	}

}
