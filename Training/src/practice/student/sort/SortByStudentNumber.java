package practice.student.sort;

import java.util.Comparator;

public class SortByStudentNumber implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		
		return one.getStudentNumber().compareTo(two.getStudentNumber());
	}

}
