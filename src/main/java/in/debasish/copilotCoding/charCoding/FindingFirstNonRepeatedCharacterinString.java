package in.debasish.copilotCoding.charCoding;

import java.util.HashMap;
import java.util.Map;

public class FindingFirstNonRepeatedCharacterinString {
	

	public static char findFirstNonRepeated(String str) {
		
		Map<Character,Integer> charfrequencyMap=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			charfrequencyMap.put(c, charfrequencyMap.getOrDefault(c, 0)+1);
		}
		for(char c:str.toCharArray()) {
			if(charfrequencyMap.get(c)==1) {
				return c;
			}
		}
		
		return '\0';
	}

	public static void main(String[] args) {

		String input="programming";
		char result=findFirstNonRepeated(input);
		System.out.println(result);
	}

}
