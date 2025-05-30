package pack1;

import java.util.ArrayList;
import java.util.List;

public class Main   {
	
	public static void main(String[] args) {
		
		
		Emppojo emppojo1=new Emppojo("pournima", 10, "Boriwali");
		Emppojo emppojo2=new Emppojo("omkar", 12, "malad");
		Emppojo emppojo3=new Emppojo("hrushikesh", 14, "kandiwali");
		Emppojo emppojo4=new Emppojo("soham", 16, "vasai");
		Emppojo emppojo5=new Emppojo("parinita", 18, "kalyan");
		
		List<Emppojo> list= new ArrayList<Emppojo>();
		list.add(emppojo1);
		list.add(emppojo2);
		list.add(emppojo3);
		list.add(emppojo4);
		list.add(emppojo5);
		
		operationsImp imp=new operationsImp();
		
		
		imp.Insertdata(list);
		imp.showdata();
		imp.Deletedata(18);
		imp.Updatedata(16, "chotu");
		imp.searchdata(10);
		imp.showdata();
		
	}

}
