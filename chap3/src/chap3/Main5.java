package chap3;

class Employe {
	String name = "pournima";
	int id = 20;
	static String department = "HR";

	double calsal() {
		double sal = 100000;
		double bonus = 2000;
		sal = sal + bonus;
		return sal;
	}

}

public class Main5 {
	public static void main(String[] args) {
		Employe employe = new Employe();
		System.out.println(employe.name);
		System.out.println(employe.id);
		System.out.println(Employe.department);
		System.out.println(employe.calsal());

	}
}
