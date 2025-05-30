package cpack1;

class Parent {
	int age;
	String name;

	void meth() {
		System.out.println(age);
		System.out.println(name);
	}
}

class Child extends Parent {
	@Override
	void meth() {
		System.out.println(super.age = 30);
		System.out.println(super.name = "Parinita");
		super.meth();
	}

}

public class Main4 {
	public static void main(String[] args) {
		Child child = new Child();
		child.meth();
	}
}
