package in.debasish.copilotReference.ankitKambojGithub;

import java.util.Arrays;

public class AnagramString {
	
	static void isAnagram(String str1,String str2) {
		
		String copyStr1=str1.replaceAll("\\s+","");
        String copystr2=str2.replaceAll("\\s+","");
        
		boolean status=true;
		
		if(copyStr1.length()!=copystr2.length()){
            status=false;
        }
        else{
            char[] s1Arr=copyStr1.toLowerCase().toCharArray();
            char[] s2Arr=copyStr1.toLowerCase().toCharArray();

            Arrays.sort(s1Arr);
            Arrays.sort(s2Arr);

            status=(Arrays.equals(s1Arr,s2Arr));
        }
		
		if(status){
            System.out.println(str1+" and " +str2+" are anagram strings");
        }
        else{
            System.out.println(str1+" and "+str2+" are not anagram strings");
        }
	}

	public static void main(String[] args) {

		isAnagram("Debasish", "Pruseth");
	}

}
