package in.debasish.programming;

import java.util.HashSet;

public class CommonElementsINArray {

	public static void main(String[] args) {
		
		Integer ar1[]= {1,2,3,4,5,65,36,70};
		Integer ar2[]= {7,2,3,4,5,60,30,70};
		
		HashSet<Integer> set1=new HashSet<Integer>();
		for(Integer num:ar1) {
			set1.add(num);
		}
		
		HashSet<Integer> commonElements=new HashSet<Integer>();
		for(Integer num:ar2) {
			if(set1.contains(num)) {
				commonElements.add(num);
			}
		}

		System.out.println("Common Elements: " + commonElements);
	}

}
