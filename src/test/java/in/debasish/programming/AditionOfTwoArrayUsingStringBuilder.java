package in.debasish.programming;

public class AditionOfTwoArrayUsingStringBuilder {

	public static void main(String[] args) {
		
		char[] charArray1 = {'H', 'e', 'l', 'l', 'o'};
        char[] charArray2 = {' ', 'W', 'o', 'r', 'l', 'd'};
        
        StringBuilder builder=new StringBuilder();
        builder.append(charArray1);
        builder.append(charArray2);
        
        String conncatenatedString=builder.toString();
        
        System.out.println(conncatenatedString);

	}

}
