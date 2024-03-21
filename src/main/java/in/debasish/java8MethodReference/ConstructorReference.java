package in.debasish.java8MethodReference;

interface M{
	public Employee getEmployee();
}

interface D{
	public Employee getEmployee(String name,int age);
	
}

class Employee{
	String eName;
	int eAge;
	
	public Employee(){} 
	
	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}
	
	public void getInfo() {
		System.out.println("I am a method of class Employee");
	}
}

public class ConstructorReference {
	
	public static void main(String[] args) {
		
		M m=()->new Employee();
		m.getEmployee().getInfo();
		
		D d=(name,age)->new Employee(name,age);
		d.getEmployee("Debasish",19).getInfo();
		
		M m1=Employee::new;
		m1.getEmployee().getInfo();
		
		D d1=Employee::new;
		d1.getEmployee("Debasish", 45);
	
	}

	
}
