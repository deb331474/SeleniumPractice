package in.debasish.programming;

public class SecondLargestInArray {

	public static void main(String[] args) {
		
		int[] array = {14, 45, 12, 36, 36, 36, 47, 58, 65, 78, 78};
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		
		for(int num:array) {
			if(num>largest) {
				secondLargest=largest;
				largest=num;
			}else if(num!=largest && num>largest) {
				secondLargest=num;
			}
		}
		 if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest number without duplicates.");
	        } else {
	            System.out.println("The second largest number without duplicates is: " + secondLargest);
	        }
		

	}

}
