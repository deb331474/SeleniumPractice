package in.debasish.programming;

public class InterningOfStrings {

	public static void main(String[] args) {
		String s1=new String("Debasish");
		String s2=s1.intern();
		System.out.println(s1==s2);
		String s3="Debasish";
		System.out.println(s2==s3);

	}

}
