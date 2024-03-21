package in.debasish.copilotReference.ankitKambojGithub;

import java.util.HashSet;

public class DuplicateInanArray {

	public static void main(String[] args) {

		
		System.out.println("Duplicate in array");

		String[] sArr={"one","two","three","two","four"};

        for(int i=0;i<sArr.length;i++){

            for(int j=i;j<sArr.length;j++){

                if((sArr[i].equals(sArr[j])) && (i!=j)){
                    System.out.println("Duplicate Element in Array is: "+sArr[j]);
                }
            }
        }
        
      //finding duplicate in array using hash set

        String[] arr={"abc","def","ghi","abc","klm","def"};

        HashSet set=new HashSet();

        for(String s:arr){
            if(!set.add(s)){
                System.out.println("duplicate element in array is: "+s);
            }
            System.out.println(set);
        }

	}

}
