package automationTesting;

public class ReveseSentence {

	public static void main(String[] args) {

		String sentence = "india is my country";
		String[] word = sentence.split(" ");
		System.out.println(word);
		for (int i = 0; i < word.length; i++) {
			String temp = word[i];
			String temp1 = "";
			char[] c = temp.toCharArray();
			for (int j = (c.length) - 1; j >= 0; j--) {
				temp1 = temp1 + c[j];
			}
			System.out.print(temp1 +" ");
		}

	}
	
}
