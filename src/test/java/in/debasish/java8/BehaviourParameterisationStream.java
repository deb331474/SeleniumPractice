package in.debasish.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BehaviourParameterisationStream {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(12,23,20,123,57,71,58,69,39,98,45,63);
		//filter even from the list
		List<Integer> evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		//converting list of names to uppercases
		
		List<String> names=Arrays.asList("Alice", "Bob", "Charlie");
		List<String> upperCaseName=names.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(upperCaseName);
		
		
		//flatten a list of list
		List<List<Integer>> nestedLists=Arrays.asList(Arrays.asList(1,2),Arrays.asList(2,3),Arrays.asList(5,6));
		
		List<Integer> flattendList=nestedLists.stream().flatMap(List::stream).collect(Collectors.toList());
		
		System.out.println(flattendList);
		
		//distinct functions
		
		List<Integer> numbersss=Arrays.asList(12,23,54,69,87,77,21,35,444,444,4454,789);
		numbersss.stream().distinct().collect(Collectors.toList());
		
		System.out.println(numbersss);
		
		List<String> namesss=Arrays.asList("Debasish","Khusboo","Mukesh","Toshali");
		
		namesss.stream().sorted().collect(Collectors.toList());
		
		System.out.println(namesss);
		

	}
	
	

}
