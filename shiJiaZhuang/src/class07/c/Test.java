package class07.c;

public class Test {
	//�����������̬������
	public static void main(String[] args) {
		System.out.println("---------��ȷ��������---------");
		Test t = new Test();
		Book b = new Book();
		b.setName("English Language");
		b.setPrice(43);
		t.process(b);
		System.out.println("---------�跽������---------");
		Novel v = new Novel();
		v.setName("Great Expectations");
		v.setPrice(35.48);
		v.setAuthor("Charles Dickens");
//		��Novel���show()�������ȵ�����Book���е�show()��������ִ����Novel���show����֮��Ĵ��롣
		t.process(v);
	}
	public void process(Book b){
		b.show();
	}

}
