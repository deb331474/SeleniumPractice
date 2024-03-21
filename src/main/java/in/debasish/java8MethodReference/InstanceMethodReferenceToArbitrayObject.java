package in.debasish.java8MethodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class InstanceMethodReferenceToArbitrayObject {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(15, 33, 59, 24, 40, 2, 19, 25,60);
		
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1,Integer i2) {

				return i1.compareTo(i2);
			}
			
			
		});
		
		System.out.println("Using anonymous inner class:");
		numbers.forEach(System.out::println);
	}

}
