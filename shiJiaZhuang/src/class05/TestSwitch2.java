package class05;

public class TestSwitch2 {
	public static void main(String[] args){
		TestSwitch2 ts=new TestSwitch2();
		int day = ts.getDaysOfMonth(2009,6);
		System.out.print(day);
		
	}
//	����һ���ж�ĳ��ĳ���ж�����ķ���
	public int getDaysOfMonth(int year,int month){
		int num = 0;
//		switch����һ���÷�����ͬС��
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
//	�����ж�����ķ���
	public boolean isLeapYear(int year){
		if((year%4 == 0) && (year%100 != 0))
			return true;
		else if(year%400 == 0)
			return true;
		else
			return false;
	
	}

}
