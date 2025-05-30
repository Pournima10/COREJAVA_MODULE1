package pack1;

class A {

	String name;
	int id;

	public A(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", id=" + id + "]";
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object deleted");
	}

}

public class Main1 {
	public static void main(String[] args) {
		A a = new A("sohummm", 20);
		a = null;
		System.gc();

	}

}
