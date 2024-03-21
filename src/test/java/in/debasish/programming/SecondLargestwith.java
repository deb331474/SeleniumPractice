package in.debasish.programming;

import java.util.Arrays;

public class SecondLargestwith {
	public static void main(String[] args) {
		
		int[] array = {14, 45, 12, 36, 36, 36, 47, 58, 65, 78, 78};
		
		Arrays.sort(array);
		
		int uniqueCount=0;
		int[] uniqueArray=new int[array.length];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]!=array[i+1]) {
				uniqueArray[uniqueCount++]=array[i];
			}
		}
		
		uniqueArray[uniqueCount++]=array[array.length-1];
		
		
		
	}
}

