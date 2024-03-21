package in.debasish.java8MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class StringLengthComparator{
	public int compareByLength(String str1,String str2) {
		return Integer.compare(str1.length(), str2.length());
	}
}

public class InstanceMethodComparator {
	
	public static void main(String[] args) {
		
		StringLengthComparator slc=new StringLengthComparator();
		
		 List<String> words = Arrays.asList("apple", "banana", "cherry", "date","kl");
		 
		 Collections.sort(words,slc::compareByLength);
		 
		 System.out.println(words);
	}

}
