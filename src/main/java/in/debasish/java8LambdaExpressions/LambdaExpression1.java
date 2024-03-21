package in.debasish.java8LambdaExpressions;

interface interf {

	public void methodOne();
}

public class LambdaExpression1 {
	public static void main(String[] args) {

		interf i = () -> System.out.println("Method one execution");
		i.methodOne();
	}
}
