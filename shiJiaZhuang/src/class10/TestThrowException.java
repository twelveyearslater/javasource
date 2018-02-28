package class10;//2016.7.19 星期二 am.7
import java.util.Scanner;

//这个程序是自己规定一个特殊的异常，然后执行抛出
//在方法体中写出抛出异常的情况
public class TestThrowException {
	public static void main(String[] args) {
		TestThrowException t = new TestThrowException();
		System.out.print("请输入你的年齡：");
		System.out.println("您的年龄："+t.inputAge());
	}
	public int inputAge(){
		int result =-1;
		Scanner scan = new Scanner(System.in);
		for(;true;){
			try{
			result = scan.nextInt();
			if(result<0||result>130){
				Exception me =new Exception("年龄超出合理范围！");
				throw me;
			}
			break;
		}catch(Exception e1){
			System.out.print(e1.getMessage()+"请重新输入：");
			continue;
		}}
	return result;	
	}

}
