package in.debasish.coreJava.ConstructorChaning;

class P {
	public P() {

		System.out.println(this.hashCode());
	}
}

class M extends P {
	public M() {

		System.out.println(this.hashCode());
	}
}

public class ConstDurga177 {

	public static void main(String[] args) {

		M m = new M();
		System.out.println(m.hashCode());
	}

}
