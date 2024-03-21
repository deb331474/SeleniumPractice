package in.debasish.programming;

public class Largest2ndLargest {

	public static void main(String[] args) {
		
		int[] array = {14, 45, 12, 36, 36, 36, 47, 58, 65, 78, 78};
		
		int largest=Integer.MIN_VALUE;
		int secndLargest=Integer.MIN_VALUE;
		
		for(int n:array) {
			if(n>largest) {
				secndLargest=largest;
				largest=n;
				
			}
			else if(n!=largest && n>secndLargest) {
				secndLargest=n;
			}
		}
		
		if(secndLargest==Integer.MIN_VALUE) {
			 System.out.println("There is no second largest number.");
        } else {
            System.out.println("The second largest number is: " + secndLargest);
		}

	}

}
