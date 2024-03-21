package in.debasish.coreJava.ConstructorChaning;

class Number{
	
	int a=10;
	int b=20;
	
	public Number() {

	System.out.println("Default Constructor of Number class");
	}
	
	public Number(Number n) {
		
		a=n.a;
		b=n.b;
	}
}
public class CopyConstructor1 {

	public static void main(String[] args) {
		Number n=new Number();
		
		System.out.println("value of a is: "+n.a);
		System.out.println("Value of b is: "+n.b);
		
		n.a=50;
		n.b=40;
		System.out.println("Updating values of a and b in the existing object");
		
		System.out.println("value of a is: "+n.a);
		System.out.println("Value of b is: "+n.b);
		
		//But when we update the values of a and b in the new object then the new value will not be updated we will get the same value as updated while constructor creation==
		
		
		Number n2=new Number();
		
		System.out.println("Not getting updated values of a and b in the new object"); 
	    System.out.println("Value of a: " +n2.a); // 10 // Getting initial data. 
	    System.out.println("Value of b: " +n2.b); // 20 // Getting initial data.
	    
	    //To get the updated value we have to pass the new object which has been created  by passing the refence variable n to the new object=====
	    
	    Number n3=new Number(n);
	    
	    System.out.println("Getting updated values of a and b in the new object"); 
	    System.out.println("Value of a: " +n3.a); // 50. Now we are getting updated values of a and b. 
	    System.out.println("Value of b: " +n3.b); // 40 
	    
	    
	}
}
