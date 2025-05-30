package pack1;

interface A  {
	void A();
}

abstract class B{
	abstract void B();
}

class C{
	void C() {}
	
}

public class Main3 {
	public static void main(String[] args) {
	A a=new A() {
		
		@Override
		public void A() {
			System.out.println("Interface ");	
			
		}
	};
			
		
		
	B b=new B() {
		
		@Override
		void B() {
			System.out.println("Abstract class");
			
		}
	};
	C c=new C() {
		void C() {
			System.out.println("Normal class");	
			}
	
	};
	
	a.A();
	b.B();
	c.C();
		
	}
}


