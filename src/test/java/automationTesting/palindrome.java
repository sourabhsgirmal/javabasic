package automationTesting;

public class palindrome {
	
	public static Boolean palindromeString (String input) {
		int length=input.length();
		Boolean result = true ;
		
		for (int i =0 ; i<=length/2;i++ ) {
			if (input.charAt(i)!=input.charAt(length-i-1)) {
				result =false;
				break;
			}
			
		}
		return result; 
	}
public static void main(String[] args) {
	System.out.println(palindromeString("11211"));
}
}
