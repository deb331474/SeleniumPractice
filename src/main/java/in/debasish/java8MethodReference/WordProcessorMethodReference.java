package in.debasish.java8MethodReference;

import java.util.Arrays;
import java.util.List;

class WordProcessor{
	public void processWord(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class WordProcessorMethodReference {

	
	public static void main(String[] args) {
		
		WordProcessor wp=new WordProcessor();
		
		 List<String> words = Arrays.asList("apple", "banana", "cherry");
		 
		 words.forEach(wp::processWord);
		 
		 
	}
}
