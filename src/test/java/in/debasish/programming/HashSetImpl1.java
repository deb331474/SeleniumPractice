package in.debasish.programming;

import java.util.HashSet;

public class HashSetImpl1 {

	public static void main(String[] args) {
		
		HashSet<String> hset=new HashSet<String>();
		hset.add("Debasish");
		hset.add("Rajesh");
		hset.add("Mukesh");
		hset.add("Bijay");
		
		System.out.println(hset);
		
		boolean isElementPresent=hset.contains("Debasish");
		System.out.println(isElementPresent);

	}

}
