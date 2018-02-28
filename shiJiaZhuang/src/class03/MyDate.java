package class03;

public class MyDate {
//	定义私有的整形变量day，mouth，year
	private int day = 1;
	private int month = 1;
	private int year=1970;
//	构造器
	public MyDate(){}
//	有参构造器
	public MyDate(int d,int m,int y){
		day = d;
		month = m;
		year = y;
	}
//	自动生成的get、set方法
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
//	空返回的方法
	public void display(){
		System.out.println(year + "-" + month + "-" + day);
	}

}
