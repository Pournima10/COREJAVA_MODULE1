package pack2;

import pack1.*;

class D extends pack1.A {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.a);
		System.out.println(d.c);
	}

class E {
		public static void main(String[] args) {
			A a2 = new A();
			System.out.println(a2.a);
		}
	}
}

public class Main {

}
