package class07.c;
//����Novel��̳�Book�࣬���岿�ֱ���
public class Novel extends Book{
	private String author;
//	���巽��
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
