package in.debasish.java8Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

class User{
	
	String username;
	String password;
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String name) {
		this.username=name;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pwd) {
		this.password=pwd;
	}
}
public class UserAuthenticationByUsingPredicate {
	
	public static void main(String[] args) {
		Predicate<User> p=u->u.getUsername().equals("Debasish") && u.getPassword().equals("java");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the username:");
		String uname=sc.next();
		System.out.println("Enter the password:");
		String pwd=sc.next();
		
		User us=new User();
		us.setUsername(uname);
		us.setPassword(pwd);
		
		if(p.test(us)) {
			System.out.println("valid User");
		}
		else {
			System.out.println("Invalid User");
		}
	}
	
	

}
