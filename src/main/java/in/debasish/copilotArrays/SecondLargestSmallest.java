package in.debasish.copilotArrays;

public class SecondLargestSmallest {

	public static void main(String[] args) {

		int[] arr= {12,85,65,37,16,98,72,68};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("The second largest element is: "+arr[1]);
		System.out.println("The second smallest element is: "+arr[arr.length-2]);
		
	}

}
