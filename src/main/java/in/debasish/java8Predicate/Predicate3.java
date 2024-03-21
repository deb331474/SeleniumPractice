package in.debasish.java8Predicate;

import java.util.function.Predicate;

public class Predicate3 {
	

	public static void main(String[] args) {
		
		
		String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"};  
		
		Predicate<String> startsWithK=s->s.startsWith("K");
		for(String s1:names) {
			if(startsWithK.test(s1)) {
				System.out.println(s1);
			}
		}
	}
}
