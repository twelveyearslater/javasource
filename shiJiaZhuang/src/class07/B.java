package class07;

import class06.A;
//B类继承A类
public class B extends A{
	public void mb(){
		m=m+1;
		n=n+2;
	}
	public static void main(String[] args) {
		B b=new B();
		b.m=7;
		b.n=8;
		b.mb();
		A a=new A();
		a.m=9;
		System.out.println(b.m+","+b.n);
		System.out.println(a.m);
//		a.n=10;    //非法
//		a.l=10;    //非法
	}

}
