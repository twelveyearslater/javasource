package class05;

public class TestSwitch {
	public static void main(String[] args){
	TestSwitch tni = new  TestSwitch();
	String s = tni.convert(1);
	System.out.println(s);
	}
	public String convert(int n){
		String day = "";
//		switch�ı�׼�÷�����������������switch���
		switch(n){
		    case 1:
			    day = "����һ";
			    break;
		    case 2:
			    day = "���ڶ�";
			    break;
		    case 3:
		    	day = "������";
		    	break;
		    case 4:
		    	day = "������";
		    	break;
		    case 5:
		    	day = "������";
		    	break;
		    case 6:
		    	day = "������";
		    	break;
		    case 0:
		    	day = "������";
		    	break;
		    default:
		    	day = "�Ƿ�";
		    	break;	
		}
		return day;
	}

}
