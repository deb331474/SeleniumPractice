package in.debasish.seleniumProgramming;

public class StringRotationChecker {

	public static void main(String[] args) {
		
		String str1="waterbottle";
		String str2="erbottlewat";
		
		boolean isRotation=isRotation(str1,str2);
		System.out.println("'" + str2 + "' is a rotation of '" + str1 + "': " + isRotation);

	}

	private static boolean isRotation(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		String concatenated=str1+str2;
		return concatenated.contains(str2);
	}

}
