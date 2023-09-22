package in.debasish.testng;

import org.testng.annotations.Test;

public class FirstTestNGCase {
	

        @Test(priority = 1)
		void logIn() {
			System.out.println("LogIn");
		}
        @Test(priority = 2)
		void Application() {
			System.out.println("Application");
		}
        @Test(priority = 3)
		void logOut() {
			System.out.println("LogOut");
		}

	}
