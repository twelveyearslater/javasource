package class09.a;//2016.7.18 ����һ pm.9

interface Runner{
	public void run();
}
interface Swimmer{
	public void swim();
}
abstract class Animal{
	public abstract void eat();
}
//һ����ֻ�ܼ̳�һ���࣬������ʵ�ֶ���ӿڡ�
class Person extends Animal implements Runner,Swimmer{
	public void run(){
		System.out.println("I am running,to the sea!");
	}
	public void swim(){
		System.out.println("I am swimming,to the island!");
	}
	public void eat(){
		System.out.println("I am eating!");
	}
}

public class Test4 {
	public static void main(String[] args) {
		Test4 t =new Test4();
		Person p = new Person();
		t.m1(p);
		t.m2(p);
		t.m3(p);
	}
	public void m1(Runner f){
		f.run();
	}
	public void m2(Swimmer s){
		s.swim();
	}
	public void m3(Animal a){
		a.eat();
	}


}