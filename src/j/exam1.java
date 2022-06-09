package j;

public class Word {
	
	private String letters;

	public Word(String letters) {
		this.letters = letters.toLowerCase();
	}
	
	public boolean isVowel (int i) {

		return (letters.substring(i, i+1).equals("a")||letters.substring(i, i+1).equals("e")||letters.substring(i, i+1).equals("i")||letters.substring(i, i+1).equals("o")||letters.substring(i, i+1).equals("u"));
		
	}
	
	public static void main (String[] args) {
		Word word = new Word("Hello World");
		System.out.println(word.isVowel(1));
		System.out.println(word.isVowel(4));
	
	}
	
	public boolean isVowel2 (int i) {
		String a = "aeiou";
		for (int index=0;i<a.length();i++) {
			if(letters.substring(i,i+1).equals(a.substring(index, index+1))) {
				return true;
                break;
			}else {
                return false;
            }
				
		}
	}

}