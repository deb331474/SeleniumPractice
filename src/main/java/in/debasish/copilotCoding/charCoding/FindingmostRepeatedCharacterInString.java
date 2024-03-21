package in.debasish.copilotCoding.charCoding;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.tuple.Pair;

public class FindingmostRepeatedCharacterInString {
	
	public static void main(String[] args) {
		String inp="Hello How are you?";
		getMostRepeatedChainString(inp);
	}
	
	public static void getMostRepeatedChainString(String input){
		Map<Character,Integer> countMap=new HashMap<Character, Integer>();
		
		for(char c:input.toCharArray()) {
			
			if(c!=' ') {
				countMap.put(c,countMap.getOrDefault(c, 0)+1);
			}
		}
		
		int maxFrequency=0;
		for(int val:countMap.values()) {
			if(val>maxFrequency) {
				maxFrequency=val;
			}
		}
		
		int secondMaxFrequency=0;
		for(int val:countMap.values()) {
			if(val<maxFrequency && val>secondMaxFrequency) {
				secondMaxFrequency=val;
			}
		}
		
		for(Map.Entry<Character,Integer> hmap:countMap.entrySet()) {
			if(hmap.getValue()==secondMaxFrequency) {
				System.out.println(hmap.getKey() + " = " + hmap.getValue());
			}
		}
	}

}
