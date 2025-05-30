package pack1;

public class Main2 {
	public static void main(String[] args) {
		System.out.println("heloo");
		System.out.println("heloo");
		System.out.println("heloo");
		System.out.println("heloo");
		try {
			String s=null;
			System.out.println(s.length());
			
		} catch (Exception e) {
			System.out.println(e);	
		}
			
		finally {
			System.out.println("this will always execute");
			System.out.println("this will always execute");
			System.out.println("this will always execute");
			
		}

}
}