package class10;//2016.7.19 ���ڶ� am.3
//�׳�һ����ջ������쳣
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
