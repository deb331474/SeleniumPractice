package in.debasish.coreJava.ConstructorChaning;

class Student1{
	
	int id;
	String name;
	
	public Student1(int i,String n) {
		
		id=i;
		name=n;

	}
	
	public Student1(Student s1) {

		id=s1.stId;
		name=s1.stName;
	
	}
	
	void display() {
		System.out.println(id+"----"+name);
	}
}
public class CopyConstructor {

	public static void main(String[] args) {
		Student s=new Student("Debasish");
		Student s2=new Student();
		s.display();
		s2.display();

	}
}
