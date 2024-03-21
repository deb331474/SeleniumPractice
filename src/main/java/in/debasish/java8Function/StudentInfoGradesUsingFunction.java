package in.debasish.java8Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Student12{
	String name;
	int marks;
	
	public Student12(String name,int marks) {

	this.name=name;
	this.marks=marks;
	
	}
}

public class StudentInfoGradesUsingFunction {

	public static void main(String[] args) {
		
		ArrayList<Student12> l=new ArrayList<>();
		populate(l);
		Function<Student12,String> f=s->{
			
			int marks=s.marks;
			if(marks>=80){
				return "A[Distiction]";
				
			}
			else if(marks>=60) {
				return "First Class";
			}
			else if(marks>=50) {
				return "Second Class";
				
			}
			else if(marks>=30) {
				return "Third Class";
			}
			else {
				return "Failed";
			}
		};
		
		Predicate<Student12> p=s->s.marks>=60;
		
		for(Student12 s:l) {
			
			if(p.test(s)) {
				System.out.println("Student Name:"+s.name);
				System.out.println("Student Marks:"+s.marks);
				System.out.println("Student Grade:"+f.apply(s));
				System.out.println();
			}
			
		}
	}
	
	static void populate(ArrayList<Student12> l) {
		l.add(new Student12("Debasish", 45));
		   l.add(new Student12("Sunny",100));   
		            l.add(new Student12("Bunny",65));   
		            l.add(new Student12("Chinny",55));   
		            l.add(new Student12("Vinny",45));   
		           l.add(new Student12("Pinny",25)); 
	}
}
