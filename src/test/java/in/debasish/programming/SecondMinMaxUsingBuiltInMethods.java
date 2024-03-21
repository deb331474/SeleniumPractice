package in.debasish.programming;

public class SecondMinMaxUsingBuiltInMethods {

	public static void main(String[] args) {
		
		int[] numbers= {12,34,23,45,76,87,54,23,23,25,87,98};
		
		if(numbers.length<2) {
			System.out.println("Number array does not have enough element for 2nd min and max");
			return;
			
		}
		
		int min1,min2,max1,max2;
		
		if(numbers[0]<numbers[1]) {
			min1=numbers[0];
			min2=numbers[1];
		}
		else {
			min1=numbers[1];
			min2=numbers[0];
		}
		
		if(numbers[0]>numbers[1]){
			max1=numbers[0];
			max2=numbers[1];
		}
		else {
			max1=numbers[1];
			max2=numbers[0];
		}

		for(int i=2;i<numbers.length;i++) {
			int current=numbers[i];
			
			if(current<min1) {
				min2=min1;
				min1=current;
			}
			else if(current<min2) {
				min2=current;
			}
			
			if(current>max1) {
				max2=max1;
				max1=current;
			}
			else if(current>max2) {
				max2=current;
			}
		}
		
		    System.out.println("Second Minimum: " + min2);
	        System.out.println("Second Maximum: " + max2);
	}

}
