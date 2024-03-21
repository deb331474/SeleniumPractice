package in.debasish.java8Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate4 {
	public static void main(String[] args) {
		
		 String[] names={"Durga","",null,"Ravi","","Shiva",null,"","Debasish"};
		 Predicate<String> p=s-> s!=null && !s.isEmpty();/*Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "s" is null
			at in.debasish.java8Predicate.Predicate4.lambda$0(Predicate4.java:10)
			at in.debasish.java8Predicate.Predicate4.main(Predicate4.java:14)*/
		 
		 //similar predicate can also be written
		 
		 Predicate<String> p1=s->s!=null && s.length()!=0;
		 
		 
		 ArrayList<String> al=new ArrayList();
		 
		 for(String st:names) {
			 if(p1.test(st)) {
				 al.add(st);
			 }
		 }
		 
		 System.out.println(al);
		
	}

}
