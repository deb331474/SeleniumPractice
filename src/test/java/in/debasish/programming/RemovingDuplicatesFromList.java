package in.debasish.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesFromList {

	public static void main(String[] args) {
		
		List<String> listWithDuplicates=new ArrayList<>();
		
		listWithDuplicates.add("apple");
		listWithDuplicates.add("apple");
		listWithDuplicates.add("banana");
		listWithDuplicates.add("apium");
		
		Set<String> uniqueElements=new HashSet<>(listWithDuplicates);
		
		System.out.println(uniqueElements);
		
		

	}

}
