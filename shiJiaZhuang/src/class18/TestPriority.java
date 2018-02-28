package class18;//2016.8.12.pm5

public class TestPriority {
	public static void main(String[] args) {
		System.out.println("start");
		Thread current = Thread.currentThread();
		System.out.println(current.getName()+"\t");
		System.out.println(current.getPriority());
		Thread t1 = new Runner();
		Thread t2 = new Runner();
		Thread t3 = new Runner();
		t1.setName("First");
		t2.setName("Second");
		t3.setName("Third");
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
	}

}
class Runner extends Thread{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(this.getName()+"\t");
			System.out.println(this.getPriority());
		}
	}
}
