package in.debasish.programming;

public class ReverseAString{
	public static void main(String[] args) {
		
		String originalString="Hello, World";
		StringBuilder reversed=new StringBuilder();
		
		for(int i=originalString.length()-1;i>=0;i--) {
			reversed.append(originalString.charAt(i));
		}
		System.out.println("Reverse String is "+reversed);
	}
}
