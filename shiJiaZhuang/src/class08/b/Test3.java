package class08.b;//2016.7.18 ÐÇÆÚÒ» am.6
class Person{
	private int id;
	public static int total = 0;
	public Person(){
		total++;
		id = total;
	}
	public int getId(){
		return id;
	}
	public static int getTotalPerson(){
		return total;
	}
}
public class Test3 {
	public static void main(String[] args) {
		System.out.println(Person.getTotalPerson());
//		Person p1 = new Person();
//		System.out.println(p1.getTotalPerson());
		for(int i=0;i<10;i++){
			new Person();
		}
		System.out.println(Person.getTotalPerson());
	}

}
