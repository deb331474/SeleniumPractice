package in.debasish.java8Predicate;

import java.util.function.Predicate;

public class Predicate2 {
	
	public static void m1(Predicate<Integer> p,int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
	}

	public static void main(String[] args) {

		int[] x= {0,5,15,13,14,19,85,97,37};
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		
		System.out.println("Numbers Greater than 10 are:");
		m1(p1,x);
		System.out.println("Even Numbers are: ");
		m1(p2,x);
		
		System.out.println("Numbers not greater than 10 are: ");
		m1(p1.negate(),x);
		
		System.out.println("Numbers grater than 10 and Even are: ");
		m1(p1.and(p2),x);
		
		System.out.println("Numbers grater than 10 or Even are:");
		m1(p1.or(p2),x);
		
		
		//to test the reverse condition
		
		System.out.println("Numbers which are Even and grater than 10");
		m1(p2.and(p1),x);
		
		System.out.println("Numbers which are Even or grater than 10");
		m1(p2.or(p1),x);
		
		
		
	}

}
