
public class Palindrome {
	public static boolean isPalindrome(String word) {
		int len = word.length();
		word=word.toUpperCase();
		for(int i=0; i<len; i++) {
			if(word.charAt(i)!= word.charAt(len-1-i)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(Palindrome.isPalindrome("Deleveled"));
	}

}
