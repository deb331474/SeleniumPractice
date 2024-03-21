package in.debasish.java8MethodReference;

import java.util.function.Function;

class StringManipulator{
	public String manipulate(String ate) {
		return ate.toUpperCase();
	}
}

public class InstanceMethodReferenceFunction {
	
	public static void main(String[] args) {
		
		StringManipulator sm=new StringManipulator();
		
		Function<String, String> functionManipulator=sm::manipulate;
		
		System.out.println(functionManipulator.apply("Debasish"));
		
	}

}
