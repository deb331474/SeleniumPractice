package in.debasish.programming;

public class AdditionOfTwoCharArrays {

	public static void main(String[] args) {
		
		char[] charArray1= {'H','e','l','l','o'};
		
		char[] charArray2= {' ','H','e','l','l','o'};
		
		int length1=charArray1.length;
		int length=charArray2.length;
		
		char[] array=new char[length+length1];
		
		System.arraycopy(charArray1, 0, array, 0, length1);
		System.arraycopy(charArray2, 0, array, length1, length);
		
		System.out.println("Concatenated char array is:" +new String(array));

	}

}
