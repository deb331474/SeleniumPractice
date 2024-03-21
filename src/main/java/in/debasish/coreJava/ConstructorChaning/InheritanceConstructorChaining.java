package in.debasish.coreJava.ConstructorChaning;


class Parent{
	
  public Parent() {
	  super();
	System.out.println("I am parent class constructor");
}
	
}

class Child extends Parent{
	
	public Child() {
		super();
		System.out.println("I am child class constructor");
	}
	
}
public class InheritanceConstructorChaining {
	
	public static void main(String[] args) {
		
		Child child=new Child();
	}

}
