package class19;//2016.8.15.pm1

class S{}

//class B extends S{}

public class IsInstance {
	public static void main(String[] args) {
		try{
			Class cls = Class.forName("class19.S");
			boolean b1 = cls.isInstance(new Integer(37));
			System.out.println(b1);
			boolean b2 = cls.isInstance(new S());
			System.out.println(b2);
//			boolean b3 = cls.isInstance(new B());
//			System.out.println(b3);
		}catch(Throwable e){
			System.err.println(e);
		}
	}
}
