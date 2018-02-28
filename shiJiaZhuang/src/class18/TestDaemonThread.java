package class18;//2016.8.12.pm4
//1. 守护线程结束后主线程还会继续运行,JVM存活；主线程结束后守护线程和JVM的状态又下面第2条确定。
//2.如果没有主线程，都是守护线程，那么JVM结束（随之而来的是所有的一切烟消云散，包括所有的守护线程）。
//守护线程的优先级比较低，用于为系统中的其它对象和线程提供服务。
public class TestDaemonThread {
	public static void main(String[] args) {
		Thread t1 = new MyRunner(100);
		t1.setName("111");
		t1.start();
		Thread t2 = new MyRunner(100);
		t2.setDaemon(true);
		t2.setName("222");
		t2.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		System.out.println("end");
	}

}
class MyRunner extends Thread{
	private int n;
	public MyRunner(int n){
		this.n = n;
	}
	public void run(){
		for(int i=0;i<n;i++){
		System.out.println(this.getName()+":"+i);
		}
	System.out.println(this.getName()+"thread!");
	}
}
