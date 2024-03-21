package in.debasish.seleniumProgramming;

public class CharArrayMet {

	public static void main(String[] args) {
	
		
		 char[] charArray = {'H', 'e', 'l', 'l', 'o'};
		 
		 char firstChar = charArray[0];
	        System.out.println("First character: " + firstChar);

	        // Modifying elements
	        charArray[0] = 'h';
	        System.out.println("Modified first character: " + charArray[0]);
	        
	        String str=new String(charArray);
	        System.out.println("Converted to string: " + str);

	        // Length of the array
	        int length = charArray.length;
	        System.out.println("Length of the array: " + length);
	}

}
