package in.debasish.java8MethodReference;

interface B{
	public boolean checkSingleDigit(int x);
}

public class StaticMethodReference2 {
	
	public static boolean isSingleDigit(int x) {
		return x>-10 && x<10;
	}
	
	public static void main(String[] args) {
		
		B b= (x)-> {return x>-10 && x<10;};
		System.out.println(b.checkSingleDigit(12));
		
		B b1=StaticMethodReference2::isSingleDigit;
		System.out.println(b1.checkSingleDigit(5));
	}

}
