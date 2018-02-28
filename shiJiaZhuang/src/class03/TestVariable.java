package class03;

class C{
	private int a=1;
//	方法m1
	public void m1(){
		int i=4,j=5;
		a+=i+j;
	}
//	方法2
	public void m2(int i){
		int j=8;
		a=a+i+j;
		System.out.println(a);
	}
}
public class TestVariable {
	public static void main(String[] args){
		C c=new C();
//		要考虑每一次执行m1方法a的值会不会变化
		c.m1();
		c.m1();
		c.m1();
		c.m1();
		int k=4;
		c.m2(k);
	}


}
