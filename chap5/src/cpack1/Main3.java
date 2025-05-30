package cpack1;

class Emp {
	Emp meth() {
		System.out.println("Parent class ");
		return this;
	}

}

class Manager extends Emp {
	@Override
	Manager meth() {
		System.out.println("child class");
		return this;
	}
}

public class Main3 {
	public static void main(String[] args) {
		Manager manager = new Manager();
		Emp emp = new Emp();
		emp.meth();
		manager.meth();
	}
}
