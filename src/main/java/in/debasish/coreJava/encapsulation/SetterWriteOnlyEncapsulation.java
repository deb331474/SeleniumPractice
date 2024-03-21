package in.debasish.coreJava.encapsulation;

class Addition{
	
	private int x,y,z;
	
	public void setX(int a) {
		x=a;
	}
	public void setY(int b) {
		y=b;
	}
	public void setZ(int c) {
		z=c;
	}
	
	void sum() {
		int s=x+y+z;
		System.out.println(s);
	}
}

public class SetterWriteOnlyEncapsulation {

	public static void main(String[] args) {
		Addition ad=new Addition();
		ad.setX(10);
		ad.setY(23);
		ad.setZ(32);
		ad.sum();
	}
}
