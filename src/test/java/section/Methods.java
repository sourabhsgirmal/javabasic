package section;

public class Methods {
	int a = 125;
	static double d =125.36;
		
	public static void main(String[] args) {
		Methods r=new Methods();
		System.out.println("main method");
		r.m1();
	}
	public void m1() {
	System.out.println("method one excuted");
	}
}