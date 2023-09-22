package in.debasish.programming;

import java.util.HashSet;

public class DistinctLettersInaString {

	public static void main(String[] args) {
		
		String sentence="Debasish Pru344534seth";
		
		HashSet<Character> distinctLetters=new HashSet<Character>();
		
		HashSet<Character> distinctDigit=new HashSet<Character>();
		
		for(Character c:sentence.toCharArray()) {
			if(Character.isLetter(c)) {
				distinctLetters.add(c);
			}
		}
		for(Character ch:sentence.toCharArray()) {
			if(Character.isDigit(ch)) {
				distinctDigit.add(ch);
			}
		}
		
		System.out.println("Distinct Letters :"+distinctLetters);

		System.out.println("Distinct Letters :"+distinctDigit);
	}

}
