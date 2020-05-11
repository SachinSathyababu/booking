package streamsapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TraverseMapJava8 {

	public static void main(String[] args) {


		Map<Integer, String> m = new HashMap<>();
		
		m.put(1, "one");
		m.put(7, "seven");
		m.put(3, "three");
		m.put(5, "five");
		m.put(2, "two");
		
		//m.forEach((k, v)->System.out.println("Key is "+k+" Value is "+v));
		
		Map.Entry<Integer, String> r = m.entrySet().stream().filter(e-> e.getKey()>3 && e.getKey()!=5).findFirst().get();
		
		//System.out.println("Key is "+r.getKey()+" Value is "+r.getValue());
		
		//m.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).forEach((e)->System.out.println("Key is "+e.getKey()+" Value is "+e.getValue()));
		
		Map<Integer, String> mp= m.entrySet().stream().filter(e-> e.getKey()>3).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));

		//mp.forEach((k, v)->System.out.println("Key is "+k+" Value is "+v));
		
		List<String> l= m.entrySet().stream().map(e-> e.getKey()+" - "+e.getValue()).collect(Collectors.toList());

		//l.forEach(e-> System.out.println(e));
		
		m.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach((e)->System.out.println("Key is "+e.getKey()+" Value is "+e.getValue()));
		
		m.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach((e)->System.out.println("Key is "+e.getKey()+" Value is "+e.getValue()));
		
	}

}
