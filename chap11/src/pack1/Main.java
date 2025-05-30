package pack1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Emp  {
	public String name;
	public int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
public class Main {
  public static void main(String[] args)  {
	  Emp emp=new Emp("pournima", 20);
	  Emp emp1=new Emp("parinita", 10);
	  Emp emp2=new Emp("omkar", 30);
	  
	 
	  
	  Emp emp3=new Emp("sneha", 10);
	  System.out.println(emp.getClass());
	  Method methods[]=emp3.getClass().getMethods();	
	  for (int i=0 ;i < methods.length ; i++) {
		  System.out.println(methods[i]);
	  }
	  System.out.println("------------------------------------");
	  Field fields[]=emp2.getClass().getFields();
	  for (int i = 0; i < fields.length; i++) {
		System.out.println(fields[i]);
	}
	  System.out.println("-----------------------------------");
	  Constructor constructor[]=emp1.getClass().getConstructors();
	  for (int i = 0; i < constructor.length; i++) {
		System.out.println(constructor[i]);
	}
}
}

