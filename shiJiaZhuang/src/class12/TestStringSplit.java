package class12;//2016.7.20 星期三am.2

public class TestStringSplit {
	public static void main(String[] args) {
		String s = "阳光:沙滩:海浪:仙人掌";
		String[] results =s.split(":");
		for(String each:results)
			System.out.println(each);
	}

}
