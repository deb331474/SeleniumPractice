package in.debasish.programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacterInAString {

	public static void main(String[] args) {
		
		String input="Hello I Am Debasish Pruseth better butter";
		
		findDuplicateCharacters(input);
	}
		
		public static void findDuplicateCharacters(String str) {
			
			str=str.replaceAll(" ", "").toLowerCase();
			
			Map<Character, Integer>  charCountMap=new HashMap<Character, Integer>();
			
			for(char c:str.toCharArray()) {
				if(charCountMap.containsKey(c)) {
					charCountMap.put(c,charCountMap.get(c)+1);
				}
				else {
					charCountMap.put(c, 1);
				}
			}
			for(Entry<Character, Integer> entry : charCountMap.entrySet()) {
				if(entry.getValue()>1){
					System.out.println(entry.getKey()+"  "+entry.getValue());
				}
			}

		}
		

	}
