package class11;//2016.7.19 ���ڶ� pm.4
//==��equals ���жϻ����������͵�ʱ�������ж�ֵ�Ƿ����
//���ж϶����ʱ���ǱȽ϶����hashCodeֵ
//���ж�String�����ʱ������������
public class TestEquals1 {
	public static void main(String[] args) {
		int i=5,j=5;
		System.out.println(i==j);
		
		Person p1= new Person(18);
		Person p2= new Person(18);
		if(p1==p2){
			System.out.println("p1==p2");
		}else{
			System.out.println("p1!=p2");
		}
		if(p1.equals(p2)){
			System.out.println("p1 is equal to p2");
		}else{
			System.out.println("p1 is not equal to p2");
		}
		
		p1=p2;
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
		
	}

}
