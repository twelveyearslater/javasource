package class19;//2016.8.15.am9

import java.lang.reflect.Field;

public class TestReflect {
	public static void main(String[] args) throws SecurityException,
	NoSuchMethodException,NoSuchFieldException,
	IllegalArgumentException,Exception{
		ReflectPointer rp1 = new ReflectPointer(3,4);
		Field fieldx = rp1.getClass().getField("x");//必须是x或者y
		System.out.println(fieldx.get(rp1));
//		private的成员变量必须使用getDeclareField，并setAccessible(true),否则看得到拿不到
		Field fieldy = rp1.getClass().getDeclaredField("y");
		fieldy.setAccessible(true);
		System.out.println(fieldy.get(rp1));
	}

}
class ReflectPointer{
	public int x = 0;
	private int y = 0;
	public ReflectPointer(int x,int y){//alt+shift+s相当于右键source
		super();
		this.x=x;
		this.y=y;
	}
}
