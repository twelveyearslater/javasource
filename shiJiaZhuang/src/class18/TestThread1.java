package class18;//2016.8.12.pm1

//个人认为：线程对象包括：
//1.线程中的运行部分即一个Runner类的队形，实现接口Runnable的类中的具体运行方法。
//2.这个线程的名字以及线程本身的其他参数
//当一个线程对线调用start方法时，此时便会找到其中的runner对象然后进行其类下的run方法
public class TestThread1 {
	public static void main(String[] args) {
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
	}
}
//实现接口的类中必须有一个空返回的run方法
class Runner1 implements Runnable{
	public void run(){
		for(int i=0;i<30;i++){
			System.out.println("No. "+i);
		}
	}
}

