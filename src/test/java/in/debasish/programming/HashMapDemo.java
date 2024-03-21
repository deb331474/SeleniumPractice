package in.debasish.programming;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap h=new HashMap();
		
		h.put("Debasish",100);
		h.put("Shibasish",200);
		h.put("Fisgashis",500);
		h.put("Montashis",600);
		h.put("Devdasi",300);
		
		System.out.println(h);
		
		h.put("Debasish",700);
		

		System.out.println(h);
		
		Set s=h.keySet();
		
		System.out.println(s);
		
		Collection c=h.values();
		System.out.println(c);
		
		Set s1=h.entrySet();
		
		System.out.println(s1);
		
		Iterator itr=s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry) itr.next();
			System.out.println(m1.getKey()+"-------------"+m1.getValue());
			
			if(m1.getKey().equals("Debasish")) {
				m1.setValue(4000);
			}
		}
		System.out.println(h);
	}

}
