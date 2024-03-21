package in.debasish.coreJava.ConstructorChaning;

public class Protein {
	
	   private String gender; 
	   private int need; 
	   private String source;
	   
	   
	   public Protein() {

		   this("female",46);
		   System.out.println("Protein requirement for children above 9 yrs is:+36gm/day");
	   }
	   
	   Protein(String s,int need){
		   this("male",56,"milk");
		   System.out.println("protein requirement for woman:46gm/day");
	   }
	   
	   Protein(String s,int need,String source){
		   this.gender=s;
		   this.need=need;
		   this.source=source;
		   
		   System.out.println("Protein requirement for men: 56 gm/day"); 
	   }
	   
	   public static void main(String[] args) {
		Protein p=new Protein();
		Protein p1=new Protein("Debasish", 13);
		
	}

}
