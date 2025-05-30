package pack1;

import java.io.IOException;

class A {
	void meth()throws IOException {
		IOException i=new IOException();
		throw i;
		
	}
class B{
	A a=new A();
	void meth2() throws IOException {
		a.meth();
		
	}
}
	
}
public class Main1 {
	public static void main(String[] args) {
		A a=new A();
		System.out.println("hi");
		try {
			a.meth();
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("heloo");
	}
	

}


