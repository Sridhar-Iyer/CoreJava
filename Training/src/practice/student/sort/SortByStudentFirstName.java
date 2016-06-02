package practice.student.sort;

import java.util.Comparator;

public class SortByStudentFirstName implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		
		return one.getFirstName().compareTo(two.getFirstName());
	}

}
