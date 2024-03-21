package in.debasish.copilotCoding.charCoding;

import java.util.HashMap;
import java.util.Map;

public class Finding3rd4thNonRepeatingCharacters {
	
	public static char findNthRepeatingCharacter(String str,int n) {
		
		Map<Character,Integer> hmap=new HashMap<>();
		
		for(char c:str.toCharArray()) {
			hmap.put(c, hmap.getOrDefault(c, 0)+1);
		}
		int count=0;
		for(char c:str.toCharArray())
		{
			if(hmap.get(c)==1) {
				count++;
			}
			if(count==n) {
				return c;
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		String input = "programming";
        int order = 4; // Find the 2nd non-repeating character
        char result = findNthRepeatingCharacter(input, order);
        
        System.out.println("The " + order + " non-repeating character is: " + result);
	}

}
