package cpack1;


final class A //cannot be extended
{
	final int a=10; // cannot be re initialized
	final void meth() // cannot override
	{
		System.out.println("This is a final method "+a);
	}
	
}

public class Main {
public static void main(String[] args) {
	A a = new A();
	a.meth();
}
}
