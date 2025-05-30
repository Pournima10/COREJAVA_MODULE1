package pack1;

class Outer1{
	
	private static int a=50;
	
	static class Inner{
		void innermeth() {
			System.out.println("This is a non static method " +a);
         }
		static void innermeth1() {
			System.out.println("This is a static method "+ a);
		}
	}
}

public class Main1 {
 public static void main(String[] args) {
	Outer1 outer1=new Outer1();
	Outer1.Inner inner= new Outer1.Inner();
	inner.innermeth();
	Outer1.Inner.innermeth1();

	
}
}
