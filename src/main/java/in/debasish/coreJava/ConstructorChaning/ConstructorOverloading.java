package in.debasish.coreJava.ConstructorChaning;

class Area{
	int length;
	int breadth;
	float radius;
	
	public Area(float r) {

		this.radius=r;
		System.out.println(radius*radius*3.14);
	}
	
	public Area(int l,int b) {
		length=l;
		breadth=b;
		System.out.println(length*breadth);

	}
	
	public Area(Area a1) {
		a1.length=length;
		a1.breadth=breadth;
		a1.radius=radius;
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		new Area(45);
		new Area(12, 35);
		new Area(12,23);
		
	}
}
