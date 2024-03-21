package in.debasish.java8MethodReference;

interface C{
	public void add(int x,int y);
}

public class InstanceMethodReference1 {
	
	public void sum(int x,int y) {
		System.out.println("sum is: "+(x+y));
	}
	
	public static void main(String[] args) {
		
		C c=(a,b)->System.out.println(a+b);
		c.add(45, 87);
		
		InstanceMethodReference1 im=new InstanceMethodReference1();
		C c1=im::sum;
		c1.add(45, 69);
	}

}
