package in.debasish.java8Function;

import java.util.function.Function;

public class GetLengthOfStringusingFunction {
	
	public static void main(String[] args) {
		
		Function<String, Integer> f=s->s.length();
		System.out.println(f.apply("Debasish"));
		System.out.println(f.apply("Khusboo"));
		System.out.println(f.apply("Debajeeta"));
		System.out.println(f.apply("Rupesh"));
	}

}
