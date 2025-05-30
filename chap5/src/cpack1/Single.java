package cpack1;

class Managerr{
	double calsal(double sal) {
		return sal;
	}
}
class Employee extends Managerr{
	@Override
	double calsal(double sal) {
		// TODO Auto-generated method stub
		return super.calsal(sal);
	}
}
public class Single {
  public static void main(String[] args) {
	Employee employee=new Employee();
	System.out.println(employee.calsal(500000));
}
}
