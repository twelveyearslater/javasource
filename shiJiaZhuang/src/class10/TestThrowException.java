package class10;//2016.7.19 ���ڶ� am.7
import java.util.Scanner;

//����������Լ��涨һ��������쳣��Ȼ��ִ���׳�
//�ڷ�������д���׳��쳣�����
public class TestThrowException {
	public static void main(String[] args) {
		TestThrowException t = new TestThrowException();
		System.out.print("������������g��");
		System.out.println("�������䣺"+t.inputAge());
	}
	public int inputAge(){
		int result =-1;
		Scanner scan = new Scanner(System.in);
		for(;true;){
			try{
			result = scan.nextInt();
			if(result<0||result>130){
				Exception me =new Exception("���䳬������Χ��");
				throw me;
			}
			break;
		}catch(Exception e1){
			System.out.print(e1.getMessage()+"���������룺");
			continue;
		}}
	return result;	
	}

}
