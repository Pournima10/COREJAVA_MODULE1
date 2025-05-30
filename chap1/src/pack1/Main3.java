package pack1;

class Address {

	String address1;
	String address2;

	public Address(String address1, String address2) {
		super();
		this.address1 = address1;
		this.address2 = address2;
	}

	@Override
	public String toString() {
		return "Address [address=" + address1 + address2 + "]";
	}
}

class Hobbies {
	String hobbie1;
	String hobbie2;

	public Hobbies(String hobbie1, String hobbie2) {
		super();
		this.hobbie1 = hobbie1;
		this.hobbie2 = hobbie2;
	}

	@Override
	public String toString() {
		return "Hobbies [hobbies=" + hobbie1 + hobbie2 + "]";
	}

}

class Student {

	String name;
	int id;
	Address address;
	Hobbies hobbies;

	public Student(String name, int id, Address address, Hobbies hobbies) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", address=" + address + ", hobbies=" + hobbies + "]";
	}
}

public class Main3 {
	public static void main(String[] args) {
		Address address = new Address("sambhajinagar ", "boriwali");
		Hobbies hobbies = new Hobbies("singing ", "gym");
		Student student = new Student("pournima", 10, address, hobbies);
		System.out.println(student);
	}

}
