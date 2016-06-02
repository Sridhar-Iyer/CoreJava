package practice.student.sort;

import java.util.Comparator;

public class SortByStudentLastName implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		
		return one.getLastName().compareTo(two.getLastName());
	}

}
