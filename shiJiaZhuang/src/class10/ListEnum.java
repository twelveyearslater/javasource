package class10;//2016.7.19 ���ڶ� am.1
//���峣�����ǣ� public static fianl.... ��
//ö��:���԰���صĳ������鵽һ��ö�����������ö���ṩ�˱ȳ�������ķ�����
enum Week{
	MON,TUE,WED,EHU,FRI,SAT,SUN
}
public class ListEnum {
	public static void main(String[] args) {
		Week oneday = Week.MON;
		Week[] days = Week.values();
		for(Week d:days){
			System.out.println(d);
		}
		System.out.println(oneday);
	}

}
