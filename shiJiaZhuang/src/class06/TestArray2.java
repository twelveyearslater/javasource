package class06;
//����һ��MyDate�࣬���Ҷ������еı���
class MyDate {
	private int day;
	private int month;
	private int year;
//���Ǹ�MyDate�Ĺ�����

	public MyDate(int d, int m, int y) {
		day = d;
		month = m;
		year = y;
	}
//����һ��disbplay()���������ڴ�ӡ
	public void display() {
		System.out.println(day + "-" + month + "-" + year);
	}
}
//����һ���������Ե�TestArry2��
public class TestArray2 {
	public static void main(String[] args){
//		����һ��MyDate�������
		MyDate[] m;
		m = new MyDate[10];
		for(int i=0;i<m.length;i++){
//			�ֱ����ҷ���洢�ռ䲢��ֵ��Ȼ���ӡ
			m[i]=new MyDate(i+1, i+1, 1990+i);
			m[i].display();
		}
	}

}
