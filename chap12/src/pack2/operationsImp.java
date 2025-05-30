package pack2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class operationsImp implements operations {
	
	List<Emppojo> db=new LinkedList<Emppojo>();
	

	@Override
	public void Insertdata(List<Emppojo> list) {
		db.addAll(list);
		System.out.println("Data is inserted");
		
		
	}

	@Override
	public void Updatedata(int id, String name) {
		ListIterator<Emppojo> iterator= db.listIterator();
		while (iterator.hasNext()) {
			Emppojo emppojo = (Emppojo) iterator.next();
			if (emppojo.getId() == id) {
				emppojo.setName(name);	
				System.out.println("data updated");
			}	
		}	
	}
	@Override
	public void Deletedata(int id) {
	ListIterator<Emppojo> iterator=db.listIterator();
	 while (iterator.hasNext()) {
		Emppojo emppojo = (Emppojo) iterator.next();
		if (emppojo.getId() == id) {
			iterator.remove();
			System.out.println("delete deleted");
			}
		}
	
	}
	@Override
	public void searchdata(int id) {
		ListIterator<Emppojo> iterator=db.listIterator();
		while (iterator.hasNext()) {
			Emppojo emppojo = (Emppojo) iterator.next();
			if (emppojo.getId() == id) {
				System.out.println(emppojo);
				System.out.println("data found");
				
			}
			
		}
		
		
		
	}

	@Override
	public void showdata() {
		ListIterator<Emppojo> iterator=db.listIterator();
		while (iterator.hasNext()) {
			Emppojo emppojo = (Emppojo) iterator.next();
			System.out.println(emppojo);
			
		}
		
		
	}

	
	
	


}
