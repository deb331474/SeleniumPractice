package in.debasish.copilotCoding.charCoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindingChractersnotinDoubleQuotes {

	public static void main(String[] args) {

		
		String input = "This is a \"sample\" string with \"double quotes\".";
		Pattern pattern = Pattern.compile("([^\"\\s]+|\"[^\"]*\")");
		Matcher matcher=pattern.matcher(input);
		
		while(matcher.find()) {
			String match=matcher.group();
			System.out.println(match);
		}
		
		
	}

}
