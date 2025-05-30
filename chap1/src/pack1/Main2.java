package pack1;

class Empp {

	double calsal(double sal) {
		return sal;
	}

	double calsal(double sal, double bonus) {

		return sal + bonus;
	}

	double calsal(double sal, double bonus, double tax) {

		return sal + bonus - tax;
	}
}

class Manager extends Empp {

	@Override
	double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.calsal(sal, bonus);
	}
}

public class Main2 {
	public static void main(String[] args) {
		Empp emp = new Empp();

		System.out.println(emp.calsal(1000));
		System.out.println(emp.calsal(1000, 2000));
		System.out.println(emp.calsal(1000, 2000, 300));

	}

}
