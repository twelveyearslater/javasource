package class17;//2016.8.8.pm6

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class CopyFile1 {
	public static void main(String[] args) {
		String source = "D://CopyFile.java";
		String dest = "D://e.txt";
		try{
			FileInputStream fis = new FileInputStream(source);//输入
			FileOutputStream fos = new FileOutputStream(dest);//输出
			FileChannel fci = fis.getChannel();
			FileChannel fco = fos.getChannel();
			ByteBuffer bb = ByteBuffer.allocate(1024);//返回一个容量为1024字节的Buffer（缓存池）
			int n = fci.read(bb);
			while(n != -1){
				bb.flip();
				fco.write(bb);
				bb.clear();
				n = fci.read(bb);
			}
			fci.close();
			fco.close();
			fis.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
