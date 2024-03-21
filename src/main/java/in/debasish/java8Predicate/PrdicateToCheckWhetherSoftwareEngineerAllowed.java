package in.debasish.java8Predicate;

import java.util.function.Predicate;

class Student{
	
	String name;
	int age;
	boolean isHavingGf;
	
	public Student(String name,int age,boolean isHavingGf) {

	this.name=name;
	this.age=age;
	this.isHavingGf=isHavingGf;
	
	}
	
	public String toString() {
		return name;
	}
}

public class PrdicateToCheckWhetherSoftwareEngineerAllowed {

	public static void main(String[] args) {

		Student[] list= { new Student("Debasish", 12, false),
				new Student("Mukesh",23,true),
				new Student("Tulsi",23,true),
				new Student("Kulsi",28,false),
				new Student("Amresh",23,true),
				new Student("Rajesh",23,false),
		};
		Predicate<Student> allowed=se->se.age>=18 && se.isHavingGf;
		System.out.println("The allowed members are:");
		for(Student s:list) {
			if(allowed.test(s)) {
				System.out.println(s);
			}
		}
	}

}
