package in.debasish.programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDuplicates {

	public static void main(String[] args) {
		int[] nums= {1, 2, 3, 4, 2, 5, 6, 3};
		List<Integer> duplicates=findDuplicates(nums);

		System.out.println(duplicates);
	}
	
	public static List<Integer> findDuplicates(int[] nums){
		
		Map<Integer,Integer> countMap=new HashMap<>();
		List<Integer> duplicates=new ArrayList<Integer>();
		
		for(int num:nums) {
			countMap.put(num,countMap.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:countMap.entrySet()) {
			if(entry.getValue()>1) {
				duplicates.add(entry.getKey());
			}
		}
		return duplicates;
	}

}
