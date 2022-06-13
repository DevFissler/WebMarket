public class Word {

	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}

	public static void main(String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isConsonant(0));
		System.out.println(word.isConsonant(2));
		System.out.println(word.isCon2(0));
		System.out.println(word.isCon2(2));
	}

	public boolean isConsonant(int i) {
		String vowel = "aeiou";
		boolean isCon = true;
		for (int index = 0; index < vowel.length(); index++) {
			if (letters.substring(i, i + 1).equals(vowel.substring(index, index + 1)) == true) {
				isCon = false;
				break;
			}
		}
		return isCon;
	}
	
	public boolean isCon2 (int i) {
		String vowel = "aeiou";
		return !(vowel.contains(letters.substring(i, i+1)));
	}
}
