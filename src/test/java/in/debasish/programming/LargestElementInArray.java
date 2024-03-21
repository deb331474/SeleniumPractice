package in.debasish.programming;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int[] numbers= {14, 45 ,12, 36, 47, 58, 65, 78};
		
		if(numbers.length==0) {
			System.out.println("The array is empty");
			return;
		}
		
		int largest=numbers[0];
		
		for(int n:numbers) {
			if(n>largest) {
				largest=n;
			}
		}
		
		System.out.println("Largest element: " + largest);

	}

}
