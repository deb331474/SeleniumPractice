package in.debasish.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
	
		List<String> listwithDuplicates=new ArrayList<>();
		
		listwithDuplicates.add("App");
		listwithDuplicates.add("App");
		listwithDuplicates.add("Apes");
		listwithDuplicates.add("App");
		listwithDuplicates.add("Apesio");
		listwithDuplicates.add("Apes");
		
		Set<String> withoutDuplicates=new HashSet<String>(listwithDuplicates);
		System.out.println("With Duplicates: "+listwithDuplicates);
		System.out.println("Without Duplicates: "+withoutDuplicates);

	}

}
