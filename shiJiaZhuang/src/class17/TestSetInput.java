package class17;//2016.8.8.pm3

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class TestSetInput {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D://3.txt");
			System.out.println(fis);
			int avg = 0;
			int total = 0;
			int count = 0;
			int num = 0;
			int i;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			while (s != null && !s.equals("over")) {
				i = Integer.parseInt(s);
				num++;
				total += i;
				avg = total / num;
				System.out.println("num=" + num + "\ttotal=" + total + "\tavg="+ avg);
				s = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}