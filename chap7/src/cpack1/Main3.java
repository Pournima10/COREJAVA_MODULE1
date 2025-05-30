package cpack1;

import java.lang.reflect.Method;
import java.util.Objects;

class Emp implements Cloneable {
	String name;
	int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}


public class Main3 {
  public static void main(String[] args) throws CloneNotSupportedException {
	  Emp emp=new Emp(null, 0);
	  Emp emp1=new Emp(null, 0);
	  Emp emp2=new Emp("omkar", 30);
	  System.out.println(emp.equals(emp1));
	  Emp empclone=(Emp)emp2.clone();
	  System.out.println(empclone);
	  
	  Emp emp3=new Emp("sneha", 10);
	  System.out.println(emp.getClass());
	  Method methods[]=emp3.getClass().getMethods();	
	  for (int i=0 ;i < methods.length ; i++) {
		  System.out.println(methods[i]);
	  }
	  emp=null;
	  System.gc();
	  
	
}
}
