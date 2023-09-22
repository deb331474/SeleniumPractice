package in.debasish.programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsAmongLists {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        List<String> list2 = new ArrayList<>();
        list2.add("banana");
        list2.add("kiwi");
        list2.add("cherry");
        
        Set<String> set1=new HashSet<>(list1);
        Set<String> set2=new HashSet<>(list2);
        
        set1.retainAll(set2);
        List<String> commonEle=new ArrayList<String>(set1);
        
        System.out.println("Common elements: " + commonEle);
        

	}

}
