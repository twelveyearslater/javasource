package class17;//2016.8.8.pm2

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.Reader;

class MyReader{
	public void getInfo(Reader reader){
		try{
//			只读一个字符型数组中的一个数据
			int b= reader.read();
			while(b!=-1){
			System.out.println((char)b);
			System.out.println("++");
//			再读字符型数组中的一个数据
			b=reader.read();
			}
			System.out.println("end");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
public class TestCharArrayReader {
	public static void main(String[] args) {
		char[] b ={'I',' ','a','m',' ','S','a','i','l','i','n','g'};
//		CharArrayReader类是Reader的子类，子类可以调用父类的方法
		CharArrayReader car = new CharArrayReader(b);
		MyReader mr = new MyReader();
		
		mr.getInfo(car);
		
	}

}
