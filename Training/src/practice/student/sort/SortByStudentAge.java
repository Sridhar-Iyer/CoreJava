package practice.student.sort;

import java.util.Comparator;

public class SortByStudentAge implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		
		return one.getAge().compareTo(two.getAge());
	}

}
