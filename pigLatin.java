public class pigLatin {

    public static void main(String[] args) {
		System.out.println(pigLatin("I love you"));
    }

	public static String pigLatin (String msg) {
		String result = "";

		while (msg.indexOf(" ") != -1) {
			int space = msg.indexOf(" ");
			String word = msg.substring(0, space);

			result += wordToPigLatin(word) + " ";
			msg = msg.substring(space + 1);
		}
		 result += wordToPigLatin(msg);
   		 return result;
	}


	public static String wordToPigLatin (String word) {
		if (word.length() <= 2) {
			return word;
		}
		String front = word.substring(0, 1);
		String end = word.substring(1);

		return end + front + "ay";
	}
}
