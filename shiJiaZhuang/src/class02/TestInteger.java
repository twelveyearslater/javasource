package class02;


public class TestInteger {
	public static void main( String[] args){
		int a = 39;
		byte abyte=127;
		short ashort=12345;
		int aint =2134567890;//2的32吃饭
		long along=0;//2的64次方
		
		System.out.println(abyte);
		System.out.println(ashort);
		System.out.println(aint);
		System.out.println(along);
		int b=0x46;//十六进制
		int c=021;//八进制
		int d=a+0x12+012;
		int e=923456789;
		int f=e+e+e+e;//超过int类型，输出错误数值
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
