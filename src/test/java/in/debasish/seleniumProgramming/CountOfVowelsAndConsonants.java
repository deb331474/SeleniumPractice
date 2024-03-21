package in.debasish.seleniumProgramming;

public class CountOfVowelsAndConsonants {

	public static void main(String[] args) {
		
		String a="Welcome to the Bangalore";
		
		int vowels=0;
		int cons=0;
		
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				vowels++;
			}
			else {
				cons++;
			}
		}
		System.out.println("The count of vowels is:"+vowels);
		System.out.println("The count of Consonants is:"+cons);

	}

}
