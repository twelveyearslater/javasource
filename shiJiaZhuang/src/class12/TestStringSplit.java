package class12;//2016.7.20 ������am.2

public class TestStringSplit {
	public static void main(String[] args) {
		String s = "����:ɳ̲:����:������";
		String[] results =s.split(":");
		for(String each:results)
			System.out.println(each);
	}

}
