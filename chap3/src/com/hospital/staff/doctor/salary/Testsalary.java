package com.hospital.staff.doctor.salary;

public class Testsalary {
	public static void main(String[] args) {
		Salary s=new Salary();
		double sal=s.calculateSalary(20000, 1000);
		System.out.println("salary "+sal);
		
	}

}
