package cpack1;

class Account {
	double calsal(double sal) {
		return sal;
	}

}

class Manager1 extends Account {
	@Override
	double calsal(double sal) {
		// TODO Auto-generated method stub
		return super.calsal(sal);
	}

	double calsal(double sal, double bonus) {
		return sal + bonus;

	}
}

class Employee1 extends Manager1 {

	@Override
	double calsal(double sal) {
		// TODO Auto-generated method stub
		return super.calsal(sal);
	}

	@Override
	double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return super.calsal(sal, bonus);
	}

	double calsal(double sal, double bonus, double tax) {
		return sal + bonus - tax;

	}
}

public class Multilevel {
	public static void main(String[] args) {
		Employee1 employee = new Employee1();
		Manager1 manager = new Manager1();
        Account account=new Account();
        System.out.println(account.calsal(900000));
		System.out.println(manager.calsal(20000, 50000));
		System.out.println(employee.calsal(200000, 2000, 100));

	}
}
