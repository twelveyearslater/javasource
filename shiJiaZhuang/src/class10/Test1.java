package class10;//2016.7.19 ���ڶ� am.5
//try catch ���Ǹ�ʲô��
//finally�Ĵ���ʮ���ʹ�õ�
//finally final������
public class Test1 {
	public static void main(String[] args) {
		String friends[]={"Lisa","Bily","Kessy","aa","bb"};
		try{
			for(int i=0;i<5;i++){
				System.out.println(friends[i]);
				}
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("index err");
			}
//		finally�е����һ��ִ��
		finally{
		System.out.println("must be use");
		}
		System.out.println("\nthis is the end");
	}
}
