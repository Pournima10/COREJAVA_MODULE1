package pack1;


class Ageverifier extends Exception{
	public Ageverifier(String messege) {
		super(messege);
	}
}

class agechekcer{
	void checkage(int age)  throws Ageverifier{
		
		if (age<18) {
			System.out.println("under age");
			
		} else {
			System.out.println("valid age");

		}
	}
}

public class Main3 {
	public static void main(String[] args) {
		agechekcer ac=new agechekcer();
		
		try {
			ac.checkage(10);
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
