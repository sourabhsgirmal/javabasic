package automationTesting;

public class ForDemo {

	public static void main(String[] args) {
		String name = "india";
		char[] word = name.toCharArray();
		String rev="";
		for (int i =word.length-1; i>=0;i--) {
			 rev =rev+ word[i];		
			 }
		System.out.println(rev);
	}

}
