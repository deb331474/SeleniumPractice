package in.debasish.stringProgramming;

public class DuplicateCharactersinaString {
	
	public static void main(String[] args) {
		
		String input="Great Responsibilty";
		
		int count;
		char[] charArray=input.toCharArray();
		
		System.out.println("Duplicate Characters in the string are:====");
		
		for(int i=0;i<charArray.length;i++) {
			count=1;
			for(int j=i+1;j<charArray.length;j++) {
				if(charArray[i]==charArray[j] && charArray[i]!=' ') {
					count++;
					charArray[j]='0';
					
				}
			}
		if(count>1 && charArray[i]!='0') {
			System.out.println(charArray[i]+" ");
		}
		
		}
		
	}

}
