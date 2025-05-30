package pack1;

public class A{
	
	public int a;
	private int b;
	protected int c;
	int d;
	
	public static void main(String[] args) {
		A aa=new A();
		System.out.println(aa.a);
		System.out.println(aa.b);
		System.out.println(aa.c);
		System.out.println(aa.d);
	
	}
}
class B{
	
	public static void main(String[] args) {
	A a1=new A();
	System.out.println(a1.a);
	System.out.println(a1.c);
	System.out.println(a1.d);

	}
}

class C extends A{
	public static void main(String[] args) {
		C c= new C();
		
		System.out.println(c.a);
		System.out.println(c.c);
		System.out.println(c.d);
	}
}

