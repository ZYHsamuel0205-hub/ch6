public class Palindrome {

    public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama."));
    }

	public static boolean isPalindrome(String str) {
		str = removeNonLetter(str);
		str = str.toLowerCase();

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static String removeNonLetter(String s) {
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		String result = "";

		for (int i = 0; i < s.length(); i++) {
			String character = s.substring(i, i + 1);
			if (!nonLetters.contains(character)) {
 			   result += character;
			}
		} 
		return result;
	}
}
