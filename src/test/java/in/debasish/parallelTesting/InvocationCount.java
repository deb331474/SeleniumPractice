package in.debasish.parallelTesting;

public class InvocationCount {
	
	@org.testng.annotations.Test(invocationCount = 20)
	void Test() {
		System.out.println("Everthing is sharabani");
	}

}
