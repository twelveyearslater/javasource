package class18;//2016.8.12.pm6

public class TestJoin {
	public static void main(String[] args) {
		MyRunner3 r = new MyRunner3();
		Thread t = new Thread(r);
		t.start();
		try{
			//调用完join方法之后，就会优先执行t的内容，直到该线程运行完成
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int i = 0;i<50;i++){
			System.out.println("index:"+i);
		}
	}
}
class MyRunner3 implements Runnable{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println("SubThread:"+i);
		}
	}
}
