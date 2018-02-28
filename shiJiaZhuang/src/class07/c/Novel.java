package class07.c;
//定义Novel类继承Book类，定义部分变量
public class Novel extends Book{
	private String author;
//	定义方法
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void show(){
		super.show();
		System.out.println("Author:"+author);
	}

}
