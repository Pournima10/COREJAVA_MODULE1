package pack1;

public class Main4 {
	public static void main(String[] args) {
		try {
			int a=10/0;
			String s=null;
			System.out.println(s.length());
			
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (NullPointerException n) {
			System.out.println(n);
		}
	
	}

}
