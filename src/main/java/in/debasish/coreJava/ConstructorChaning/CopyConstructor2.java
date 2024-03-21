package in.debasish.coreJava.ConstructorChaning;

class Mango{
	boolean sweet;
	
	public Mango(boolean b) {

	sweet=b;
	}
	
	public Mango(Mango m) {

		sweet=m.sweet;
	}
	
	public void flavour() {
		if(sweet) {
			System.out.println("Then the mango is sweet");
		}
		else {
			System.out.println("The mango is sour;");
		}
	}
}
public class CopyConstructor2 {
	
	public static void main(String[] args) {
		Mango m=new Mango(true);
		m.flavour();
		Mango m1=new Mango(m);
		m1.sweet=false;
		m1.flavour();
	}

}
