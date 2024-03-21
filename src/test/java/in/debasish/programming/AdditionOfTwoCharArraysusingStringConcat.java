package in.debasish.programming;

public class AdditionOfTwoCharArraysusingStringConcat {

	public static void main(String[] args) {
		
		char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};
        char[] charArray2 = {' ', 'W', 'o', 'r', 'l', 'd'};
        
        String str1=new String(charArray1);
        String str2=new String(charArray2);
        
        
        String concatenatedString=str1.concat(str2);
        
        System.out.println(concatenatedString);

	}

}
