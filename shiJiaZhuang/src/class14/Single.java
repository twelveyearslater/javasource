package class14;

public class Single {
//	˽�л��Լ��Ĺ�����
//	�����ڲ�ʵ����һ����̬�Ĺ�����
//	дһ��public,static���͵ķ������������ʵ�����ⲿ����
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

