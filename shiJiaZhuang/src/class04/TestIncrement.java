package class04;

public class TestIncrement {
	public static void main(String[] args){
		int i = 5,j;
//		i������1���ٸ�j��ֵ
		j=++i;
		System.out.println("i="+i+"\tj="+j);
//		�ȸ�j��ֵ��i������1
		j=i++;
		System.out.println("i="+i+"\tj="+j);
//		���ȼ�����
		j=4 * i--;
		System.out.println("i="+i+"\tj="+j);
		j=4 * --i;
		System.out.println("i="+i+"\tj="+j);
	}

}
