package in.debasish.java8Function;

import java.util.function.Function;

public class FunctionalInterfaceStaticMethod {

	public static void main(String[] args) {

		Function<String, String> f=Function.identity();
		Class<? super String> s=(Class<? super String>) f.apply("Debasish").getClass();
		String s1=f.apply("DebasishPruseth");
		System.out.println(s);
		System.out.println(s1);
		
	}

}
