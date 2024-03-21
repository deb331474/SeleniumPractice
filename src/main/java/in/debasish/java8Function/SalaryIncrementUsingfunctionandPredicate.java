package in.debasish.java8Function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1{
	
	String ename;
	double salary;
	
	public Employee1(String name,double sal) {

		this.ename=name;
		this.salary=sal;
		
	}

	@Override
	public String toString() {
		
		return ename+": "+salary;
	}
}

public class SalaryIncrementUsingfunctionandPredicate {
	
	public static void main(String[] args) {
		
		ArrayList<Employee1> l=new ArrayList<Employee1>();
		l.add(new Employee1("Debasish", 1500));
		l.add(new Employee1("Subhasish", 1800));
		l.add(new Employee1("Mahesh", 1300));
		l.add(new Employee1("Himanshu", 1580));
		l.add(new Employee1("Sangesh", 1512));
		l.add(new Employee1("Lokesh", 1536));
		l.add(new Employee1("Dinesh", 15000));
		
		System.out.println(l);
		
		Predicate<Employee1> sal=e->e.salary>=1500; 
		
		ArrayList<Employee1> l2=new ArrayList<Employee1>();
		
		Function<Employee1,Employee1> f=e->{

			e.salary=e.salary+477;
			return e;
		};
		
		for(Employee1 e:l) {
			if(sal.test(e)) {
				l2.add(f.apply(e));
			}
		}
		
		System.out.println("Employees with incremented salary:::::::::");
		System.out.println(l2);
		
		
	}

}
