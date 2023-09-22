package in.debasish.programming;

import java.util.Arrays;
import java.util.HashSet;

public class RemovingDuplicateeleArray {

	public static void main(String[] args) {
		
		Integer[] numbers= {1,2,3,4,5,6,1,2,2,3,3};
		
		HashSet<Integer> uniqueNumbers=new HashSet<Integer>(Arrays.asList(numbers));
		System.out.println("Original Array: "+Arrays.toString(numbers));
		System.out.println("Unique Elements: "+uniqueNumbers);

	}

}
