package in.debasish.java8Function;

import java.util.function.Function;

public class RemovingSpacesInString {
	public static void main(String[] args) {
		
		String s="My name is Debasish Pruseth";
		Function<String, String> f=st->st.replaceAll(" ", "?");
		System.out.println(f.apply(s));
	}

}
