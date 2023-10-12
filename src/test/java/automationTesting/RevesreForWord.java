package automationTesting;

public class RevesreForWord {

	
	public static void main(String[] args) {
		String str ="sourabh";
		String rev="" ;
		char word[]=str.toCharArray();
		System.out.println(word);
		for (int i=word.length-1;i>=0;i--) {
			 rev=rev+word[i];
		}
		System.out.println(rev);
	}
}
