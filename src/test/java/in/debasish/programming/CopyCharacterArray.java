package in.debasish.programming;

import java.util.Arrays;

public class CopyCharacterArray {

	public static void main(String[] args) {
		
		char[] sourceArray= {'A','B','C'};
		
		char[] shallowCopy=sourceArray.clone();
		
		char[] deepCopy=Arrays.copyOf(sourceArray,sourceArray.length);
		
		System.out.println("Shallow Copy "+Arrays.toString(shallowCopy));
		
		System.out.println("Deep Copy "+Arrays.toString(deepCopy));

	}

}
