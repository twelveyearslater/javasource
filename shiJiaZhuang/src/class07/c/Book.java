package class07.c;
//����һ��Book�༰���ֱ���
public class Book {
	private String name;
	private double price;
//	���岿�ַ���
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
