package main;

import consumer.employee;
import consumer.manager;

public class Main  {
	public static void main(String[] args) {
		
		manager manager=new manager();
		employee employee=new employee();
		System.out.println(employee.calsal(2000));
		System.out.println(manager.calsal(30000, 40000));
		
	}

}
