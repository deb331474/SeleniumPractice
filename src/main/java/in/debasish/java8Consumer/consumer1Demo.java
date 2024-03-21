package in.debasish.java8Consumer;

import java.util.function.Consumer;

public class consumer1Demo {
	
	public static void main(String[] args) {
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("Debasish");
		c.accept("Khunchoo");
	}

}
