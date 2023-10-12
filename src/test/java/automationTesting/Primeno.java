package automationTesting;

public class Primeno {
	public static boolean isprime(int no) {
		if (no==0 || no==1) {
			 return false;
		}
		if (no==2) {
			return true ;
		}
		for (int i=1;i<=no/2;i++) {
			if(no%2==0) {
			return false;
			}
		}
		return true;
	}
public static void main(String[] args) {
	System.out.println(isprime(11));
}
}
