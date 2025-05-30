package pack1;

class Test {

	void meth() {
		final int a = 20;

		class local {
			void localmeth() {
				System.out.println("Inside the meth " + a);
			}

		}
		local local = new local();
		local.localmeth();
	}
}

public class Main2 {
	public static void main(String[] args) {
		Test test= new Test();
		test.meth();
	}

}
