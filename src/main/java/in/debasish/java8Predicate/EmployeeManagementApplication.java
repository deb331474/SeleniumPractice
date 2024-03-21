package in.debasish.java8Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
	String name;
	String designation;
	double salary;
	String city;

	public Employee(String name, String designation, double salary, String city) {
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.city = city;

	}

	public String toString() {

		String s = String.format("[%s,%s,%.2f,%s]", name, designation, salary, city);
		return s;

	}

	public boolean equals(Object obj) {
		Employee e = (Employee) obj;

		if (name.equals(e.name) && designation.equals(e.designation) && salary == e.salary && city == e.city) {
			return true;

		} else {
			return false;
		}
	}
}

public class EmployeeManagementApplication {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList();
		populate(list);

		Predicate<Employee> p = em -> em.designation.equals("Developer");
		System.out.println("Devlopers' information");
		display(p, list);
		
		Predicate<Employee> p1=m->m.designation.equals("CEO");
		System.out.println("CEO information:");
		display(p1, list);
		
		Predicate<Employee> p2=m->m.city.equals("Bangalore");
		System.out.println("Employee from Bangalore ");
		display(p2, list);
		
		Predicate<Employee> p3=emp->emp.salary>=1500;
		System.out.println("Employee having salary less than 1500:");
		display(p3, list);
		
		Predicate<Employee> p4=emp->emp.designation.equals("Manager");
		System.out.println("All Mangers information from Bangalore:");
		display(p4, list);
		
		System.out.println("All managers from Bangalore having pink slip");
		display(p4.and(p2), list);
		
		System.out.println("Employees Information who are either Managers or salary <1500");
		display(p4.or(p3), list);
		
	    System.out.println("All Employees Information who are not managers:");
	    display(p4.negate(), list);
	    
	    Predicate<Employee> isCEO=Predicate.isEqual(new Employee("Debasish","CEO",45000,"Sambalpur"));
	    Employee emp1=new Employee("Don", "CEO", 32000, "Balangir");
	    System.out.println(isCEO.test(emp1));
	    
	    //whenever we are applying the predicate with constructor initialisation and setting a set of predefined values then if one of the values fail then ultimately the predicate will 
	    //also become false in isEqual method
	    
	    

	}

	public static void populate(ArrayList<Employee> list) {

		list.add(new Employee("Durga", "CEO", 30000, "Hyderabad"));
		list.add(new Employee("Sunny", "Manager", 20000, "Hyderabad"));
		list.add(new Employee("Mallika", "Manager", 20000, "Bangalore"));
		list.add(new Employee("Kareena", "Lead", 15000, "Hyderabad"));
		list.add(new Employee("Katrina", "Lead", 15000, "Bangalore"));
		list.add(new Employee("Anushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Kanushka", "Developer", 10000, "Hyderabad"));
		list.add(new Employee("Sowmya", "Developer", 10000, "Bangalore"));
		list.add(new Employee("Ramya", "Developer", 10000, "Bangalore"));

	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> list) {
		for (Employee e : list) {
			if (p.test(e)) {
				System.out.println(e);
			}
		}
		System.out.println("**************************************************");
	}

}
