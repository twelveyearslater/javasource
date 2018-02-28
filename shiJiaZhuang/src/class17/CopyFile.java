package class17;//2016.8.8.am1

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		try{
			//鎶婄鐩樹笂鐨勬暟鎹俊鎭鍏ュ埌jvm閲�
			//把磁盘上的数据信息读入到jvm里
			FileInputStream fis = new FileInputStream("D://1.jpg");
			//浠巎vm褰撲腑鎶婁俊鎭啓鍏ュ埌鐩爣鏂囦欢褰撲腑
			//从jvm当中把信息写入到目标文件当中

			FileOutputStream fos = new FileOutputStream("E://temp.jpg");
			//绗竴娆′粠fis瀵硅薄褰撲腑璇诲彇鏁版嵁
			//第一次从fis对象当中读取数据

			int read = fis.read();
			while(read != -1){
//				把已经读取到的数据写入到fos对象当中

				fos.write(read);
//				鎺ョ潃璇诲彇fis涓殑鏁版嵁
//				接着读取fis中的数据

				read = fis.read();
			}
			fis.close();
			fos.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
