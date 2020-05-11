package streamsapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import javax.swing.RowFilter.ComparisonType;

public class Frequncy {

	public static void main(String[] args) {


		int[] a= new int [] {1, 2, 1, 3, 2, 1, 3,3,3, 2, 4, 5};
		
		Map<Integer, Integer> m= new HashMap<>();
		
		for(int i=0; i<a.length; i++) {
			
			if(m.containsKey(a[i])) {
				
				m.put(a[i], m.get(a[i])+1);
			}else {
				
				m.put(a[i], 1);
				
			}
		}
		
		//m.entrySet().forEach(e-> System.out.println("Element is "+e.getKey()+" , No of Occurances is "+e.getValue() ));

		m.entrySet().stream().filter(e -> e.getValue() > 1).sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(e-> System.out.println("Element is "+e.getKey()+" , No of Occurances is "+e.getValue() ));
	
		Map.Entry<Integer, Integer> q=m.entrySet().stream().max((e1, e2)->e1.getValue().compareTo(e2.getValue())).get();
		
		//System.out.println("Highest Occurance is "+q.getKey());
	}

}
