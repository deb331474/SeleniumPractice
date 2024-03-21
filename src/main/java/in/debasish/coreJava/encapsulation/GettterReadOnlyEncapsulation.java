package in.debasish.coreJava.encapsulation;

class Employee {

	private String Ename;
	private int id;
	private String nCompany;

	Employee(String name, int id, String nCompany) {
		this.Ename = name;
		this.id = id;
		this.nCompany = nCompany;
	}

	public String getName() {
		return Ename;
	}

	public int getEmplId() {
		return id;
	}

	public String getCompanyName() {
		return nCompany;
	}

}

public class GettterReadOnlyEncapsulation {

	public static void main(String[] args) {

		Employee em = new Employee("Debasish", 12, "Impelsys");
		String name = em.getName();
		int id = em.getEmplId();
		String nCompany = em.getCompanyName();

		System.out.println("Employee's name: " + name);
		System.out.println("Employee's id: " + id);
		System.out.println("Company's name: " + nCompany);

	}

}
