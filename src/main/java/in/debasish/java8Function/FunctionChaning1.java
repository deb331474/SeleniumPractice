package in.debasish.java8Function;

import java.util.function.Function;

public class FunctionChaning1 {
	
	public static void main(String[] args) {
		
		Function<String, String> f1=s->s.toUpperCase();
		Function<String, String> f2=s->s.substring(0, 9);
		
		System.out.println("The result of f1 "+f1.apply("DebasishPruseth"));
		System.out.println("The result of f2 "+f2.apply("DebasishPruseth"));
		System.out.println("The result of f1 "+f1.andThen(f2).apply("DebasishPruseth"));

		System.out.println("The result of f1 "+f2.compose(f1).apply("DebasishPruseth"));
	}

}
