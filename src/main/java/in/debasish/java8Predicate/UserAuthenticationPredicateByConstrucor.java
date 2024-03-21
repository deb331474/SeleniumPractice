package in.debasish.java8Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User1{
	String username;
	String password;
	
	public User1(String uname,String password) {

		this.username=uname;
		this.password=password;
	}
}
public class UserAuthenticationPredicateByConstrucor {

	public static void main(String[] args) {
 
		Predicate<User1> p=u->u.username.equals("Debasish") && u.password.equals("Java");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname=sc.next();
		System.out.println("Enter the password:");
		String pwd=sc.next();
		
		User1 user=new User1(uname, pwd);
		
		if(p.test(user)) {
			System.out.println("Valid user and can avail all the services");
		}
		else {
			System.out.println("Invalid users and cannot avail the services");
		}

		
	}

}
