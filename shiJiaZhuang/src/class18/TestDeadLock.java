package class18;//2016.8.12.pm7

public class TestDeadLock {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ABCD");
		MyThread t = new MyThread(sb);
		t.start();
		synchronized(sb){//方法锁关键字，一次只有一个线程运行方法锁里的代码
			for(int i=0;i<30;i++){
				System.out.println("No. "+i);
			    System.out.println(Thread.currentThread().getName());
			    }
			try{
				t.join();
			}catch(InterruptedException e){
				e.printStackTrace();
			}

			System.out.println("Main thread is over!");
			
		}
	}

}
class MyThread extends Thread{
	private StringBuffer sb;
	public MyThread(StringBuffer sb){
		this.sb=sb;
	}
	public void run(){
		synchronized(sb){
			sb.reverse();
		}
		for(int i=0;i<30;i++){
			System.out.println("No. "+i);
		    System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Sub thread is over!");
	}
}
