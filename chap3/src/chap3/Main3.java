package chap3;

class Company{
	
	double calsal(double sal) {
		
		return sal;
	}
   
	double calsal(double sal, double bonus) {
		
		return sal+bonus;
	}
	
    double calsal(double sal, double bonus, double tax) {
		
		return sal+bonus-tax;
	}
 }

class Employee extends Company{
	
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
	
	@Override
	double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return super.calsal(sal, bonus, tax);
	}
	
	
}

public class Main3 {
	public static void main(String[] args) {
		Employee employee= new Employee();
		System.out.println(employee.calsal(20000));
		System.out.println(employee.calsal(20000, 40000));
		System.out.println(employee.calsal(20000, 30000, 4000));
	}

}
