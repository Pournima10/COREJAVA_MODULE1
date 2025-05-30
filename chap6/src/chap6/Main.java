package chap6;


abstract class Company {
	 
	 
	 void hours() {
		 System.out.println("daily hours 7");
	 }
	 
	 abstract void work();
	 
	 abstract void sal();
}

interface policy{
	double calsal(double sal); 	
}
	
class Employe extends Company implements policy{

	@Override
	void work() {
		System.out.println("work");
	}

	@Override
	void sal() {
		System.out.println("sal");
		
	}

	@Override
	public double calsal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
 }

public class Main {
	public static void main(String[] args) {
		Employe employe=new Employe();
		System.out.println(employe.calsal(2000));
		employe.work();
		employe.sal();
		
		
	}

}
