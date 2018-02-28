package class05;

public class TestSwitch2 {
	public static void main(String[] args){
		TestSwitch2 ts=new TestSwitch2();
		int day = ts.getDaysOfMonth(2009,6);
		System.out.print(day);
		
	}
//	这是一个判断某年某月有多少天的方法
	public int getDaysOfMonth(int year,int month){
		int num = 0;
//		switch的另一种用法，大同小异
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			num = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			num = 30;
			break;
		case 2:
			num = this.isLeapYear(year)?29:28;
			break;
		}
		return num;
	}
//	这是判断闰年的方法
	public boolean isLeapYear(int year){
		if((year%4 == 0) && (year%100 != 0))
			return true;
		else if(year%400 == 0)
			return true;
		else
			return false;
	
	}

}
