package class06;

public class TestArray1 {
	public static void main(String[] args){
		int[] a=new int[3];
		System.out.println(a[2]);
//		Ps��a[3]����������Ԫ��a[0],a[1],a[2]
		for(int i=0;i<3;i++){
			a[i] = 2*i+1;
			System.out.print(a[i] + "\t");
		}
	}

}
