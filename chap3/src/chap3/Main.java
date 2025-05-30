package chap3;

class Student {
	String name;
	int id;
	static String branch;
	static String subject;
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void studentdet() {
		System.out.println(name);
		System.out.println(id);
		}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	static void educationaldet() {
		
		System.out.println(branch);
		System.out.println(subject);
	}
}
public class Main {
	static {
		Student.branch="CMPN";
		Student.subject="Microprocessor";

	
	}
public static void main(String[] args) {
		Student student=new Student("poonu", 38);
		System.out.println(student);
		student.studentdet();
		Student.educationaldet();
		
	}

}
