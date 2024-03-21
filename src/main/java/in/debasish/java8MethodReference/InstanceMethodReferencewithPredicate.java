package in.debasish.java8MethodReference;

import java.util.function.Predicate;

class StringUtils{
	public boolean isPalindrome(String str) {
		String reversed=new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
}

public class InstanceMethodReferencewithPredicate {
	
	public static void main(String[] args) {
		
		StringUtils su=new StringUtils();
		
		Predicate<String> isPalindrome=su::isPalindrome;
		System.out.println(isPalindrome.test("radar"));
		System.out.println(isPalindrome.test("Debasish"));
	}

}
