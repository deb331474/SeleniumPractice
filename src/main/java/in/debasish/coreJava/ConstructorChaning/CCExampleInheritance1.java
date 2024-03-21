package in.debasish.coreJava.ConstructorChaning;

class Base {

	private String name;

	public Base() {

		this("Debasish");
		System.out.println("No arguement constructor of the base class");

	}

	Base(String name) {
		this.name = name;

		System.out.println("Parametrized constructor of the base class");
	}
}

class Derived extends Base {
	public Derived() {

		super();
		System.out.println("No-argument of constructor of derived class");

	}

	Derived(String name) {

		super();
		System.out.println("Calling parameterized constructor of derived");
	}
}

public class CCExampleInheritance1 {

	public static void main(String[] args) {
		Derived dr = new Derived();
		//new Derived("Debasish");
	}
}
