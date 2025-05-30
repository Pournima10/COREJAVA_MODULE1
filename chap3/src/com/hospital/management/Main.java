package com.hospital.management;
import com.hospital.staff.doctor.salary.Salary;


class Manager extends Salary{
	
	public void displaysal() {
	double sal = calculateSalary(6000, 1200); 
	System.out.println("SALARY "+ sal);
	}
}

public class Main {
	public static void main(String[] args) {
		Manager manager=new Manager();
		manager.displaysal(); 
	}

}
