package pack1;

class Employee{
    String name;
    int id;
    static String dept;
    static String company;
    
    public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	void employeeinfo() {
    	System.out.println(name);
    	System.out.println(id);
    	
    }
    
    @Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}

	static void showcomdet() {
    	
    	System.out.println(dept);
    	System.out.println(company);
    }
    
}

public class Main1 {
	static {
		Employee.company="SFIT";
		Employee.dept="Computer";
		
	}
	public static void main(String[] args) {
		
		Employee employee=new Employee("pournima", 10);
		System.out.println(employee);
		employee.employeeinfo();
		Employee.showcomdet();
	}

}

