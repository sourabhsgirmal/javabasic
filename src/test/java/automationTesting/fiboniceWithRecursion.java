package automationTesting;

public class fiboniceWithRecursion {
	
	public static int FiboniceNumber(int count) {
		if (count<=1) {
			return count;
		}
		return FiboniceNumber(count-1) + FiboniceNumber(count-2);
	}
	public static void main(String[] args) {
		int seglength = 10;
		for (int i =0;i<=seglength;i++) {
			System.out.print(FiboniceNumber(i)+",");
		}
	}

}
