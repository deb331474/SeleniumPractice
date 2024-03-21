package in.debasish.coreJava.encapsulation;

class Mensuration{
	  private double l, b, r;
	  
	  
	  //all the getter methods
	  
	  public double getL() {
		  return l;
	  }
	  public double getB() {
		  return b;
	  }
	  public double getR() {
		  return r;
	  }
	  
	  //all the stter metghods for the private variables
	  
	  public void setLength(double l) {
		  this.l=l;
	  }
	  public void setBreadth(double b) {
		  this.b=b;
		  
	  }
	  public void setRadius(double r) {
		  this.r=r;
	  }
	  
	  //now writing the logic for finding the area of rec,circle
	  
	  public double areaRec() {
		  double area=l*b;
		  return area;
	  }
	  
	  public double perRec() {
		  double perimetr=2*(l+b);
		  return perimetr;
	  }
	  
	  public double areaCir() {
		  double area=2*3.14*r;
		  return area;
	  }
	  
	  public double circumCircle() { 
		    double circumference = 2 * 3.14 * r; 
		    return circumference; 
		   } 
	
}

public class GetterandSetters {

	public static void main(String[] args) {
		
		Mensuration ms=new Mensuration();
		ms.setBreadth(45.2);
		ms.setLength(56.230);
		ms.setRadius(5.9);
		
		double RectArea=ms.areaRec();
		double RectPeri=ms.perRec();
		double CircleArea=ms.areaCir();
		double periCircle=ms.circumCircle();
		
		System.out.println("Area of Rectangle is: "+RectArea);

		
	}

}
