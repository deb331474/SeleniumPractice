package in.debasish.polymorphism;

class Bank{
	float getRateofInterst() {
		return 0;
	}
}

class SBI extends Bank{
	float getRateofInterst() {
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getRateofInterst() {
		return 7.5f;
	}
}

class AXIS extends Bank{
	float getRateofInterst() {
		return 9.8f;
	}
}

public class RuntimePolymorphism {
	
	public static void main(String[] args) {
		Bank b;
		b=new SBI();
		System.out.println("SBI Interest Rate: " + b.getRateofInterst());
		
		b=new ICICI();
		System.out.println("ICICI Interest Rate: " + b.getRateofInterst());
		
		b=new AXIS();
		System.out.println("AXIS Interest Rate: " + b.getRateofInterst());
	}

}
