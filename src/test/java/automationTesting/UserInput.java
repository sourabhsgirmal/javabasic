package automationTesting;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner ref = new Scanner(System.in);
		System.out.println("enter a number :");
		int a = ref.nextInt();

		System.out.println("enter a string :");

		String name = ref.next();

		String concat = name + "@" + a;

		System.out.println(concat);

	}

}
