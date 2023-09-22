package in.debasish.programming;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCalculator {

	public static void main(String[] args) {
		
		 String text = "This is a sample sample text. This text is meant for demonstration purposes.";
		 
		 Map<String,Integer> wordFrequency=new HashMap<>();
		 
		 String[] words=text.split("[^a-zA-Z0-9]+");
		 for(String word:words) {
			 if (!word.isEmpty()) {
			 word=word.toLowerCase();
			 wordFrequency.put(word,wordFrequency.getOrDefault(word,0)+1);
		 }
		 }
		 
		 for(Map.Entry<String, Integer> entry: wordFrequency.entrySet()){
			 
			 System.out.println("'" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
		 }

	}

}
