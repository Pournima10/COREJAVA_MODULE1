package cpack1;

class Bank {

	float getrateofinterest() {
		return 0;

	}
}

class SBI extends Bank {
	@Override
	float getrateofinterest() {

		return 9.7f;
	}
}

class ICICI extends Bank {

	@Override
	float getrateofinterest() {

		return 8.5f;
	}
}

class HDFC extends Bank {

	@Override
	float getrateofinterest() {

		return 8.8f;
	}
}

public class Main1 {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println(b.getrateofinterest());
		b = new ICICI();
		System.out.println(b.getrateofinterest());
		b = new HDFC();
		System.out.println(b.getrateofinterest());

	}

}
