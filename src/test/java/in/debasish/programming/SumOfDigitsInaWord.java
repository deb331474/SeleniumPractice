package in.debasish.programming;

public class SumOfDigitsInaWord {

	public static void main(String[] args) {
		String S="Deb2345si89s098h";
		
		int sum=0;
		
		for(char c:S.toCharArray()) {
			if(Character.isDigit(c)) {
				int digit=Character.getNumericValue(c);
				sum+=digit;
			}
		}
		
		System.out.println("Sum of digits in the string "+sum);
		
	}

}
