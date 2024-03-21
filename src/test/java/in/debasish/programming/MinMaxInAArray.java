package in.debasish.programming;

public class MinMaxInAArray {

	public static void main(String[] args) {
		
		int[] numbers = {14, 45, 12, 36, 47, 58, 65, 78};
		
		if(numbers.length==0) {
			System.out.println("The array is empty");
		}

		int min=numbers[0];
		int max=numbers[0];
		
		for(int n:numbers) {
			if(n<min) {
				min=n;
			}
			if(n>max) {
				 max = n;
			}
		}
		
		System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
		
	}

}
