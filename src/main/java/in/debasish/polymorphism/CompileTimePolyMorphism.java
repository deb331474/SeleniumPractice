package in.debasish.polymorphism;


public class CompileTimePolyMorphism {
	
	
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		CompileTimePolyMorphism ctp=new CompileTimePolyMorphism();
		System.out.println("integer addition with 2 parameters "+ctp.add(12, 31));
		System.out.println("integer addition with 3 parameters "+ctp.add(12, 31,98));
		System.out.println("double addition with 2 parameters "+ctp.add(12.87, 31.98));
	}
	

}
