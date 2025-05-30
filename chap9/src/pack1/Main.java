package pack1;

class Outer {
      private int a=50;
      private String name="Pournima";
	class Inner {
		void innermeth() {
			System.out.println(a);
			System.out.println(name);
		}
		

	}

}

public class Main {
	public static void main(String[] args) {
		Outer outerr = new Outer();
        Outer.Inner inner=outerr.new Inner();
        inner.innermeth();
	}

}
