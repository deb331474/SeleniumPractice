package in.debasish.programming;

public class LongestWordFinder {

	public static void main(String[] args) {
		String input="This is a demonstration of finding the longest word in a sentence.";
		
		String longestword=findLongestWord(input);

		System.out.println("Longest word: " + longestword);
	}
	
	public static String findLongestWord(String input) {
		String[] words=input.split(" ");
		String longest="";
		for(String word:words) {
			if(word.length()>longest.length()) {
				longest=word;
			}
		}
		return longest;
	}

}
