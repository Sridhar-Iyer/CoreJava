package practice.student.sort;

import java.util.Comparator;

public class SortByStudentGrade implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		
		return one.getGrade().compareTo(two.getGrade());
	}

}
