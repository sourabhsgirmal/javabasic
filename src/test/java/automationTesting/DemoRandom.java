package automationTesting;

import java.util.Random;

public class DemoRandom {

	public static void main(String[] args) {

		Random r1 = new Random();

		int a = r1.nextInt(100);
		double b = r1.nextDouble(10);
		
		System.out.println(a);
		System.out.println(b);

	}

}
