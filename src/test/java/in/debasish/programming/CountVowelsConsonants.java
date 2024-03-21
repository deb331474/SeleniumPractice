package in.debasish.programming;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		
		String text="Debasish, Pruseth";
		
		int vowels=0;
		
		int consonants=0;
		
		text=text.toLowerCase();
		
		for(char c:text.toCharArray()) {
			if(Character.isLetter(c)) {
				if("aeiou".contains(String.valueOf(c))) {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		
		System.out.println("The count of the vowels are: "+vowels);
		System.out.println("The count of consonants are "+consonants);

	}

}
