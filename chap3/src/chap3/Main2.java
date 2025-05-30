package chap3;


class Studentt{
	String name;
	int id;
	double fees;
	String college;

	public Studentt(String name, int id, double fees, String college) {
		super();
		this.name = name;
		this.id = id;
		this.fees = fees;
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", fees=" + fees + ", college=" + college + "]";
	}
	
	void showdetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(fees);
		System.out.println(college);
	}
	
}
public class Main2 {
	public static void main(String[] args) {
		Studentt student=new Studentt("sneha", 12, 12000, "SFIT");
		System.out.println(student);
		student.showdetails();
		
	}

}
