package pack1;



class Hobbies{
	
	@Override
	public String toString() {
		return "Hobbies [hobbie=" + hobbie + "]";
	}

	String hobbie;

	public Hobbies(String hobbie) {
		super();
		this.hobbie = hobbie;
	}
}
class Address{
	
	String cityname;
	String area;
	public Address(String cityname, String area) {
		super();
		this.cityname = cityname;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", area=" + area + "]";
	}
	
}
class Emp{
	
	String name;
	int id;
	Hobbies hobbie;
	Address address;
	public Emp(String name, int id, Hobbies hobbie, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.hobbie = hobbie;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", hobbie=" + hobbie + ", address=" + address + "]";
	}
	
}

public class Main {
	public static void main(String[] args) {
		
		Hobbies hobbie=new Hobbies("null");
		Address address=new Address("mumbai", "boriwali");
		Emp emp=new Emp("shaunak", 12, hobbie ,address);
		System.out.println(emp);
	}

}
