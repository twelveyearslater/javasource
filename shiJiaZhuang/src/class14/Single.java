package class14;

public class Single {
//	私有化自己的构造器
//	在类内部实例化一个静态的构造器
//	写一个public,static类型的方法，返回这个实例供外部调用
	private String name;
	private static Single onlyone = new Single();
	
	private Single(){
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Single getSingle(){
		return onlyone;
	}


}

