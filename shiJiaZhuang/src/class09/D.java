package class09;//2016.7.18 ÐÇÆÚÒ» pm.10

interface A{
	public void ma();
}
interface B{
	public int mb(int i);
}
interface C extends A,B{
	public String mc();
}
public class D implements C{
	public void ma(){
		System.out.println("Implements method ma()!");
	}
	public int mb(int i){
		return 2000+i;
	}
	public String mc(){
		return "Hello!";
	}

}
