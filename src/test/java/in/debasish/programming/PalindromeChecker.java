package in.debasish.programming;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.nextLine();
		
		boolean isPalindrome=isPalindrome(input);
		
		System.out.println("is it a palindrome "+isPalindrome);

	}
	
	public static boolean isPalindrome(String str) {
		str=str.replaceAll("//s", "").toLowerCase();
		int left=0;
		int right=str.length()-1;
		while(left<right) {
			if(str.charAt(left)!=str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

}
