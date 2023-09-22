package in.debasish.programming;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.devtools.v113.input.Input;

public class UniqueChrarcters {
	public static void main(String[] args) {

		String input = "aqbcdefg";

		boolean HasUniqueCharacters = hasUniqueCharacters(input);
		
		System.out.println("Unique Characters are:"+HasUniqueCharacters);

	}

	public static boolean hasUniqueCharacters(String str) {
		Set<Character> characterSet = new HashSet<Character>();
		for (char ch : str.toCharArray()) {
			if (!characterSet.add(ch)) {
				return false;
			}
		}
		return true;
	}

}
