package in.debasish.java8LambdaExpressions;

interface sum{
	public void add(int a,int b);
	
}
public class LambdaExpressions2 {
	
	public static void main(String[] args) {
		sum s1=(a,b)->System.out.println("The methodOne execution "+(a+b));
		s1.add(12, 26);
	}

}
