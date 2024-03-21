package in.debasish.coreJava.encapsulation;

class Person{
	
	private String name;
	private int age;
	private String addrs;
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getAddress() {
		return addrs;
	}
	
	public void setAddress(String address) {
		this.addrs=address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
}
public class Encapsulation1 {
	
	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Debasish");
		p.setAge(30);
		p.setAddress("Laida");
		
		System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress()+" "+p.getClass());
	}

}
