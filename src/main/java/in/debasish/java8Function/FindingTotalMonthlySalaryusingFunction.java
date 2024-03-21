package in.debasish.java8Function;

import java.util.ArrayList;
import java.util.function.Function;

class Employee{
	
	String name;
	double salary;
	
	public Employee(String name,double salary) {
		
		this.name=name;
		this.salary=salary;

	}
	
	public String toString() {
		return name+":"+salary;
	}
	
}

public class FindingTotalMonthlySalaryusingFunction {

	public static void main(String[] args) {
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		populate(l);
		System.out.println(l);
		Function<ArrayList<Employee>,Double> f1=i1->{
			double total=0;
			for(Employee e:l) {
				total=total+e.salary;
			}
			return total;
		};

		System.out.println("The total salary of all the employees are "+f1.apply(l));
	}
	
	static void populate(ArrayList<Employee> l) {
		l.add(new Employee("Debasish", 1500));
		l.add(new Employee("Subhasish", 1800));
		l.add(new Employee("Mahesh", 1300));
		l.add(new Employee("Himanshu", 1580));
		l.add(new Employee("Sangesh", 1512));
		l.add(new Employee("Lokesh", 1536));
		l.add(new Employee("Dinesh", 15000));
	}

}
