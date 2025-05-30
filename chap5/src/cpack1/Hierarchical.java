package cpack1;

class Dept {
	void selectsub() {

	}
}

class Maths extends Dept {
	@Override
	void selectsub() {
		System.out.println("You select maths");
	}
}

class English extends Dept {
	@Override
	void selectsub() {
		System.out.println("you select English");
	}
}

public class Hierarchical {
	public static void main(String[] args) {
		Maths maths = new Maths();
		maths.selectsub();
		English english = new English();
		english.selectsub();
	}
}
