package in.debasish.coreJava.ConstructorChaning;

public class ConstructorChaning1 {
	
 ConstructorChaning1() {
		this("java", 1556);
		

		System.out.println("Default Constructor called");
	}
	
	ConstructorChaning1(int year){
		
		this();
		System.out.println("one parameter constructor called");
	}
	
	ConstructorChaning1(String name,int year){
		
		System.out.println("two parameter constructor called");
	}

	void display() {
		System.out.println("A general method with display functionality");
	}
	
	public static void main(String[] args) {
		
		ConstructorChaning1 cc=new ConstructorChaning1();
		cc.display();
		
	}
}
