package in.debasish.java8;

import java.util.List;

public class LambdaExpression {

	public static void main(String[] args) {
		
		List<Integer> numbers=List.of(12,9,36,4,52,89,68,54,2,1,36,98,74,5,9,71,31,23);

		List<String> courses=List.of("Spring", "Spring Boot", "API" , "Microservices","AWS", "PCF","Azure", "Docker", "Kubernetes");
		
		courses.stream().forEach(System.out::println);
		
		courses.stream().filter(s->s.contains("Spring")).forEach(System.out::println);
		
		courses.stream().filter(s->s.length()>=4).forEach(System.out::println);
		
		courses.stream().map(c->c+" "+c.length()).forEach(System.out::println);
		
		printCubesofOddNumbers(numbers);
		printingoddNumbersInList(numbers);
	}
		
		private static void printingoddNumbersInList(List<Integer> numbers) {
			
			numbers.stream().filter(n-> n%2 != 0).forEach(System.out::println);
		}
		
		private static void printCubesofOddNumbers(List<Integer> numbers) {
			numbers.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
		}
		
		
	}
