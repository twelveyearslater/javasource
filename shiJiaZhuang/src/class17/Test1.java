package class17;//2016.8.8.am2

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;//2016.8.8.am2

public class Test1 {
	public static void main(String[] args) {
		try{
			FileReader input = new FileReader("D://1.txt");
			FileWriter output = new FileWriter("D://temp.txt");
			int read = input.read();
			while(read != -1){
				output.write(read);
				read = input.read();
			}
			input.close();
			output.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}


}
