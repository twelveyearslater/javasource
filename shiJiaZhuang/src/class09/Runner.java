package class09;//2016.7.18 星期一 pm.7
//定义了一个接口类Runner，如果有类链接此接口就要写出具体的内部方法并与接口中的抽象方法一一对应。
//抽象类继承接口时特殊。
public interface Runner {
	public static final int id=1;
	public void start();
	public void run();
	public void stop();

}

//接口与类相似点：
//一个接口可以有多个方法。
//接口文件保存在.java结尾的文件中，文件名使用接口名。
//接口的字节码文件保存在.class结尾的文件中。
//接口相应的字节码文件必须在与包名称相匹配的目录结构中。 

//接口与类的区别：
//接口不能用于实例化对象。
//接口没有构造方法。
//接口中所有的方法必须是抽象方法。
//接口不能包含成员变量，除了static和final变量。
//接口不是被类继承了，而是要被类实现。
//接口支持多重继承。

//接口有以下特性：
//接口是隐式抽象的，当声明一个接口的时候，不必使用abstract关键字。
//接口中每一个方法也是隐式抽象的，声明时同样不需要abstract关键子。
//接口中的方法都是公有的。