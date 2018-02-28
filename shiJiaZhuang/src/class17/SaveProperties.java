package class17;//2016.8.8.pm5

import java.io.FileWriter;
import java.util.Properties;

public class SaveProperties {
	public static void main(String[] args) {
		try{
			Properties ps = new Properties();
			ps.setProperty("name", "Scott");
			ps.setProperty("password", "Tiger");
			FileWriter fw = new FileWriter("D://p.txt");
			ps.store(fw, "loginfo");
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
