package in.debasish.coreJava.encapsulation;

class Student{
	
	private String name;
	private int id;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
}

public class Encapsulation {
	

	public static void main(String[] args) {

		Student st=new Student();
		st.setName("Debasish");
		st.setId(12);
		System.out.println(st.getName()+" "+st.getId());
	}

}
