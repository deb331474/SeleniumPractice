package in.debasish.java8Function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {

		Function<String, String> f1=s->s.toLowerCase();
		Function<String, String> f2=s->s.substring(0,5);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username:");
		String uname=sc.next();
		System.out.println("Enter password:");
		String passwd=sc.next();
		
		if(f1.andThen(f2).apply(uname).equals("rupes") && passwd.equals("java")) {
			System.out.println("Valid user");
		}
		else {
			System.out.println("invalid user");
		}
	}

}
