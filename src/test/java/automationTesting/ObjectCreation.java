package automationTesting;

public class ObjectCreation {
	int a = 30;
	int b = 50;
	static String name = "sourabh";

	public static void main(String[] args) {
		Match p = new Match();

		ObjectCreation sum = new ObjectCreation();
		int c = sum.a + sum.b;
		System.out.println(c);

		Match.m1();
		p.m2();
		p.m2();
		int d = p.m4();

		System.out.println(d);
	}
}