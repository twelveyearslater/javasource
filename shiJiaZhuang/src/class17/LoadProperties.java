package class17;//2016.8.8.pm4

import java.io.FileReader;
import java.util.Properties;

public class LoadProperties {
	public static void main(String[] args) {
		try{
			Properties ps = new Properties();
			FileReader fr = new FileReader("D://p.txt");
			ps.load(fr);
			fr.close();
			ps.list(System.out);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
