package class07.c;

public class Test {
	//理解面向对象多态的意义
	public static void main(String[] args) {
		System.out.println("---------正确方法调用---------");
		Test t = new Test();
		Book b = new Book();
		b.setName("English Language");
		b.setPrice(43);
		t.process(b);
		System.out.println("---------需方法调用---------");
		Novel v = new Novel();
		v.setName("Great Expectations");
		v.setPrice(35.48);
		v.setAuthor("Charles Dickens");
//		在Novel类的show()方法中先调用了Book类中的show()方法，又执行了Novel类的show方法之后的代码。
		t.process(v);
	}
	public void process(Book b){
		b.show();
	}

}
