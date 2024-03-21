package in.debasish.coreJava.ConstructorChaning;

abstract class Person{
	String name; 
	int age; 
    int height; 
    int weight;
    
    public Person(String name, int age, int height, int weight) {

    	this.name=name;
    	this.age=age;
    	this.height=height;
    	this.weight=weight;
    
    }
    
    @Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
}

class Student12 extends Person{
	
	int rollNo,marks;
	
	@Override
	public String toString() {
		return super.toString()+"Student [rollNo=" + rollNo + ", marks=" + marks + "]";
	}

	public Student12(String name, int age, int height, int weight,int rollNo,int marks) {
		super(name, age, height, weight);
		this.rollNo=rollNo;
		this.marks=marks;
	}		
}

class Teacher extends Person{
	
	String sub;
	@Override
	public String toString() {
		return super.toString()+"Teacher [sub=" + sub + ", salary=" + salary + "]";
	}

	double salary;
	
	public Teacher(String name, int age, int height, int weight,String sub,double salary) {
		super(name, age, height, weight);
		this.sub=sub;
		this.salary=salary;
	}
}

public class WithAbstractClassConstructor {
	
	public static void main(String[] args) {
		
		Teacher tc=new Teacher("Debasish", 12, 53, 65, "Sam", 45000);
		System.out.println(tc);
		Student12 sc=new Student12("Samsher", 45, 120, 39, 450, 15000);
		System.out.println(sc);
		Person p=new Person("Mukesh", 12, 14, 23) {};
		System.out.println(p);
	}

}
