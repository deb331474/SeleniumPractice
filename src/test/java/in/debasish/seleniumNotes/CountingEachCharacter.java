package in.debasish.seleniumNotes;

import java.util.HashMap;

public class CountingEachCharacter {

	public static void main(String[] args) {
		
		String str="Debasish Kumar Pruseth";
		
		HashMap<Character, Integer> charCount=new HashMap<Character, Integer>();
		
		char[] ch=str.toCharArray();
		
		for(char c:ch) {
			if(charCount.containsKey(c)) {
				int x=charCount.get(c);
				charCount.put(c,x+1);
			}
			else {
				charCount.put(c, 1);
			}
		}
		
		System.out.println(charCount);

	}

}
