package class08;//2016.7.18 ÐÇÆÚÒ» am.5

import class08.Person;

public class Test2 {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println(p.age);
		Person.total = 100;
		Person.getInfo();
		System.out.println(Person.total);
	}

}
