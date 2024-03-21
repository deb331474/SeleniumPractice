package in.debasish.coreJava.ConstructorChaning;


class School{
	
	String stName; 
    int stRoll; 
    int stId; 
    
    
    public School() {
		
    	System.out.println("I am parent class constructor");
	}
    
    public School(String schoolName) {
    
    	
    	System.out.println("The student name is "+schoolName);
    
    }
    
    public School(int id) {

    	System.out.println("The student id is "+id);
    
    }
    
    
    public School(String stName, int stRoll, int stId) {
		
    	  this.stName = stName; 
          this.stRoll = stRoll; 
          this.stId = stId; 
	}
    
    void display() 
    { 
       System.out.println("Name: " +stName); 
       System.out.println("Roll no. : " +stRoll); 
       System.out.println("Id: " +stId); 
    } 
    
}

class Student extends School{
	
	public Student() {

		super("Debasish");
	}
	 Student(String schoolName) 
	  { 
	     this(); 
	  } 
	
}
public class SchoolStudentCC {
	
	public static void main(String[] args) {
		
		Student st=new Student("DPS");
		st.display();
	}
	
	

}
