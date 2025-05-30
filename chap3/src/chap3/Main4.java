package chap3;
class A{
	
	private String name;
	private int id;
	private double sal;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	
}
public class Main4 {
   public static void main(String[] args) {
	 A a=new A();
	 a.setName("pournima");
	 a.setId(10);
	 a.setSal(2000000);
	 System.out.println(a.getName());
	 System.out.println(a.getId());
	 System.out.println(a.getSal());
	 
	 
   }
}
