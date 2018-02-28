package class07.c;
//定义一个Book类及部分变量
public class Book {
	private String name;
	private double price;
//	定义部分方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void show(){
		System.out.println("BookName:"+name+"\nPrice:"+price);
	}

}
