package in.debasish.collectionsTreeMap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortingTreeMapByValue {
	
	public static <K,V extends Comparable<V>> Map<K,V> sortByValues(final Map<K,V> map){
		
		Comparator<K> valueComparator=new Comparator<K>() {

			@Override
			public int compare(K k1, K k2) {

			  int compare=map.get(k1).compareTo(map.get(k2));
			  if(compare==0) {
				  return 1;
			  }
			  else {
				  return compare;
			  }
			}
		};
		
		Map<K, V> sortedByValues=new TreeMap<K, V>(valueComparator);
		sortedByValues.putAll(map);
		return sortedByValues;
	}
	
	public static void main(String[] args) {
		
		 TreeMap<String, String> treemap = new TreeMap<String, String>();

		    // Put elements to the map
		    treemap.put("Key1", "Jack");
		    treemap.put("Key2", "Rick");
		    treemap.put("Key3", "Kate");
		    treemap.put("Key4", "Tom");
		    treemap.put("Key5", "Steve");
		    
		    Map sortedMap=sortByValues(treemap);
		    Set set=sortedMap.entrySet();
		    Iterator i=set.iterator();
		    while(i.hasNext()) {
		    	Map.Entry me=(Entry) i.next();
		    	System.out.println("The key is: "+me.getKey()+" While the value is: "+me.getValue());
		    }
	}

}
