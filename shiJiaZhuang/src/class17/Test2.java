package class17;//2016.8.8.am3

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
	public static void main(String[] args){
	try{
		FileReader input = new FileReader("D://1.txt");
		BufferedReader br = new BufferedReader(input);
		FileWriter output = new FileWriter("D://temp.txt");
		BufferedWriter bw = new BufferedWriter(output);
		String s = br.readLine();
		while(s != null){
			bw.write(s);
			bw.newLine();
			s = br.readLine();
		}
		br.close();
		bw.close();
	}catch(IOException e){
		e.printStackTrace();
		}
	}
}

