package in.debasish.java8Predicate;

import java.util.function.Predicate;

public class Predicate1 {
	
	public static void main(String[] args) {
		Predicate<Integer> p=i->(i>10);
		System.out.println(p.test(12));
		System.out.println(p.test(3));
		System.out.println(p.test(10));
	}

}
