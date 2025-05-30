package pack5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Student implements Comparable<Student> {
	String name;
	int id;
	double marks;

	public Student(String name, int id, double marks) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		if (this.marks < o.marks) {
			return -1;

		} else if (this.marks > o.marks) {
			return +1;
		} else
			return 0;
	}

}

public class Main {
	public static void main(String[] args) {
      Student student1=new Student("tom", 10, 50);
      Student student2=new Student("jerry", 11, 60);
      Student student3=new Student("harry", 12, 80);
      Student student4=new Student("ron", 13, 70);
      
      List<Student> student= new ArrayList<Student>();
      student.add(student1);
      student.add(student2);
      student.add(student3);
      student.add(student4);
       System.out.println("before");
       Iterator<Student> iterator = student.iterator();
		while (iterator.hasNext()) {
			Student students = (Student) iterator.next();
			System.out.println(students);
		}
      Collections.sort(student);
      
      System.out.println("after");
		Iterator<Student> iterator2 = student.iterator();
		while (iterator2.hasNext()) {
			Student students = (Student) iterator2.next();
			System.out.println(students);
		}

		System.out.println("-------------------------------");
		
		Collections.sort(student, new markscomparator());
		Iterator<Student> iteratorr = student.iterator();
		while (iterator.hasNext()) {
			Student students = (Student) iterator.next();
			System.out.println(student);
		}
		
	}
}
