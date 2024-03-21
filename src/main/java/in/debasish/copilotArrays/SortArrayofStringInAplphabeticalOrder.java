package in.debasish.copilotArrays;

import java.util.Arrays;

public class SortArrayofStringInAplphabeticalOrder {

	public static void main(String[] args) {
		
	
	String[] arrString={"Java",
            "Python",
            "ReactJS",
            "Angular",
            "C#"
	};
	
	
	System.out.println("input Ararys is: "+Arrays.toString(arrString));
	
	arrString=Arrays.stream(arrString).sorted().toArray(String[]::new);
	
	System.out.println("sorted Ararys is: "+Arrays.toString(arrString));
	
	}
	
}
