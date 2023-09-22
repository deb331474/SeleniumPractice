package in.debasish.programming;

import java.util.LinkedHashSet;

public class LinkedHashImpl {

	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet<>();
		
		lh.add("s");
		lh.add("d");
		lh.add("j");
		lh.add("k");
		lh.add(null);
		lh.add(10);
		
		lh.add("j");
		
		System.out.println(lh);

	}

}
