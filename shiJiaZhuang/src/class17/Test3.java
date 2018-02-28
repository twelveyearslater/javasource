package class17;//2016.8.8.pm1

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
	public static void main(String[] args) {
		try{
			FileInputStream fis;
			DataInputStream dis;
			FileOutputStream fos;
			DataOutputStream dos;
			fos = new FileOutputStream("D://2.txt");
			dos = new DataOutputStream(fos);
			String str = "安宁1";
			dos.writeUTF(str);
			dos.close();//������Java������л�յ�Ŀ���ļ���//把我们Java里的数据谢日到目标文件中
			
			fis = new FileInputStream("D://2.txt");
			dis = new DataInputStream(fis);
			System.out.println("name:"+dis.readUTF());
			fis.close();
		}catch(IOException e){
			System.out.println(e);
		}
	}

}
