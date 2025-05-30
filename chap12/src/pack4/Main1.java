package pack4;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Main1 {
 public static void main(String[] args) {
	 
	 Properties properties=new Properties();
	 properties.put("India ", "Delhi");
	 properties.put("China", "Beijing");
	 properties.put("japan ", "Tokyo");
	 properties.put("France ", "Paris");
	 
	 Set  set=properties.keySet();
	 Iterator iterator=set.iterator();
	 while (iterator.hasNext()) {
		String string = (String) iterator.next();
		System.out.println(string+" "+ properties.getProperty(string));
	}
	 
	String string1=properties.getProperty("US", "not found");
	System.out.println(string1);
	 
}
}
