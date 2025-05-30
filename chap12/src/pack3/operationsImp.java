package pack3;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;



public class operationsImp implements operations {

	List<Emppojo> db = new Vector<Emppojo>();

	@Override
	public void Insertdata(List<Emppojo> list) {
		db.addAll(list);
		System.out.println("Data is inserted");

	}

	@Override
	public void Updatedata(int id, String name) {
		Enumeration<Emppojo> enumeration = ((Vector<Emppojo>) db).elements();
		while (enumeration.hasMoreElements()) {
			Emppojo emppojo = (Emppojo) enumeration.nextElement();
			if (emppojo.getId() == id) {
				emppojo.setName(name);
			}
		}
	}

	@Override
	public void Deletedata(int id) {
		Iterator<Emppojo> iterator = db.iterator();
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
		Enumeration<Emppojo> enumeration = ((Vector<Emppojo>) db).elements();
		while (enumeration.hasMoreElements()) {
			Emppojo emppojo = (Emppojo) enumeration.nextElement();
			if (emppojo.getId() == id) {
				System.out.println(emppojo);
				System.out.println("data found");

			}

		}

	}

	@Override
	public void showdata() {
		Enumeration<Emppojo> enumeration = ((Vector<Emppojo>) db).elements();
		while (enumeration.hasMoreElements()) {
			Emppojo emppojo = (Emppojo) enumeration.nextElement();
			System.out.println(emppojo);

		}

	}

}
