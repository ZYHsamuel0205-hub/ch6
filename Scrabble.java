public class Scrabble {
    
    public static void main(String[] args) {
		System.out.println (canSpell("taco", "cat"));
		}

public static boolean canSpell (String tiles, String word) {
    for (int i = 0; i < word.length(); i++) {
		char letter = word.charAt(i);

		int available = countLetter (tiles, letter);
		int needed = countLetter (word, letter);

		if (available < needed) { // whether the entire word can be spelled
			return false;
		}
	}	
	return true;
}

public static int countLetter (String s, char target) {
	int count = 0;
	for (int i = 0; i < s.length(); i++) {
		if (s.charAt(i) == target) {
			count++;	
			}
		}
	return count;
	}
}
