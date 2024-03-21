package in.debasish.exceptionsHandling;


class Person{
	
	private String name;
	private int age;
	private double salary;
	
	public Person(String name,int age,double salary){
		
		if(age<0) {
			throw new IllegalArgumentException("age cannot be negative");
		}
		
		if(salary<0) {
			throw new IllegalArgumentException("Salary cannot be negative");
		}
		
		this.name=name;
		this.age=age;
		this.salary=salary;
	
	}
}

public class UsingThrowKeyword {
	
	public static void main(String[] args) {
		try {
			Person p=new Person("Debasish", -12, 45000);
		}
		catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		try {
			Person p=new Person("Debasish", 12, -40000);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error: "+e.getMessage());
		}
	}

}
