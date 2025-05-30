package pack4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {
public static void main(String[] args) {
	Map<Integer, String> map=new HashMap<Integer, String>();
	
	map.put(1, "pournima");
	map.put(2, "parinita");
	map.put(3, "sneha");
	map.put(4, "nishita");
	
	System.out.println(map.keySet());
	System.out.println(map.values());
	System.out.println(map.entrySet());
	
	Set set=map.entrySet();
	Iterator iterator=set.iterator();
	while (iterator.hasNext()) {
		Map.Entry<Integer, String> entry=(Entry<Integer, String>) iterator.next();
		System.out.println(entry.getKey() +" " + entry.getValue());
		
	}
	
	
	
}
}
