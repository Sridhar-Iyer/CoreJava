package practice.student.sort;

import java.util.Comparator;

public class SortByStudentRank implements Comparator<Student> {

	@Override
	public int compare(Student one, Student two) {
		
		return one.getRank().compareTo(two.getRank());
	}

}
