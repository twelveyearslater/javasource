package class13;//2016.7.20 ÐÇÆÚÈýpm.1

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt());
		System.out.println(rand.nextInt(10));
		System.out.println(rand.nextBoolean());
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextFloat());
	}

}
