package class18;//2016.8.12.pm3

public class TestThread3 {
	public static void main(String[] args) {
		Runner1 r = new Runner1();
		Thread t = new Thread(r);
		t.start();
	}

}

class Runner3 extends Thread {
	public void run() {
		for(int i=0;i<30;i++){
			System.out.println("No. "+i);
		}
	}
}

