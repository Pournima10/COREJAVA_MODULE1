package pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class operationsImp implements operations {
	
	List<Emppojo> db=new ArrayList<Emppojo>();
	

	@Override
	public void Insertdata(List<Emppojo> list) {
		db.addAll(list);
		System.out.println("Data is inserted");
    }

	@Override
	public void Updatedata(int id, String name) {
		Iterator<Emppojo> iterator= db.iterator();
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
	Iterator<Emppojo> iterator=db.iterator();
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
		Iterator<Emppojo> iterator=db.iterator();
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
		Iterator<Emppojo> iterator=db.iterator();
		while (iterator.hasNext()) {
			Emppojo emppojo = (Emppojo) iterator.next();
			System.out.println(emppojo);
		}
  }
}
