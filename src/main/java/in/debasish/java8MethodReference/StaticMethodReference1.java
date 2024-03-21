package in.debasish.java8MethodReference;

interface A{
	public void getName(String name);
}

public class StaticMethodReference1 {
	
	public static void getInfo(String info) {
		System.out.println(info);
	}
	
	public static void main(String[] args) {
		
		A a=(String s)->System.out.println(s);
		a.getName("SAM is executing");
		
		A a1=StaticMethodReference1::getInfo;
		a1.getName("static method is executing");//method reference to getInfo method but we are calling getName where indirectly getInfo is executing...
		
	}

}
