package in.debasish.java8;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams1 {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(12,23,4,5,66,78,12,18,19,72,98,36);
		
		List<Integer> evenNumbersOnly=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		System.out.println(evenNumbersOnly);
		
		List<Integer> squaredNumbers=squareNumbers(numbers);
		System.out.println(squaredNumbers);
		
		numbers.stream().distinct().sorted().forEach(System.out::println);
		
		List<Integer> oddNumbersOnly=numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
		
		System.out.println(oddNumbersOnly);
		
		int greatest=numbers.stream().reduce(Integer.MIN_VALUE,(x,y)->x>y?x:y);
		
		System.out.println(greatest);
		
		int sumOfSquares=numbers.stream().map(x->x * x).reduce(0,(x,y)->x+y);
		System.out.println(sumOfSquares);
		
		

	}
	
	private static List<Integer> squareNumbers(List<Integer> numbers){
		return numbers.stream().map(n->n*n).toList();
		
	}
	
	

}
