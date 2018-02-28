package class11;//2016.7.19 星期二 pm.4
//==和equals 在判断基本数据类型的时候都是在判断值是否相等
//在判断对象的时候是比较对象的hashCode值
//在判断String对象的时候有特殊的情况
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
