package pack2;

 interface A{
	 void A();
 }
abstract class B{
	abstract void  B();
}
class C{
	A a;
	B b;
	public C(A a, B b) {
		super();
		this.a = a;
		this.b = b;
	}
  public void C() {
	  a.A();
	  b.B();
  }
}

public class Main1 {
	public static void main(String[] args) {
		C c=new C(new A() {
			public void A() {
				System.out.println("Interface");
			};
			
		}, new B() {
			
		void B() {
			System.out.println("abstract");
		};
		});
	c.C();
	}

}
