package class10;//2016.7.19 星期二 am.3
//抛出一个堆栈溢出的异常
public class TestVirtualMachineError {
	public static void main(String[] args) {
		TestVirtualMachineError tvme = new TestVirtualMachineError();
		int a=tvme.f(8981);
		System.out.println(a);
	}
	
	public int f(int n){
		if(n<=0)
			return 0;
		int k = n*this.f(n-1);
		return k;
	}

}
