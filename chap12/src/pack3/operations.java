package pack3;

import java.util.List;

public interface operations {
	
	void Insertdata(List<Emppojo> list);
	void Updatedata(int id, String name);
	void Deletedata(int id);
	void searchdata(int id);
	void showdata();
	

}
