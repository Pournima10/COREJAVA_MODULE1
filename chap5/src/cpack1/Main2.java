package cpack1;

class Admin{
	
	double calattendence(double attendence) {
		return attendence;
	}
	double calattendence(double attendence, double grace) {
		return attendence+grace;
	}
}
class Student extends Admin{
@Override
	double calattendence(double attendence) {
	
		return super.calattendence(attendence);
	}

    @Override
    	double calattendence(double attendence, double grace) {
    		
    		return super.calattendence(attendence, grace);
    	}
	
}

public class Main2 {
 public static void main(String[] args) {
	 Student student=new Student();
	 System.out.println(student.calattendence(20000));
	 System.out.println(student.calattendence(20000, 300000));
	
}
}
