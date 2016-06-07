package practice.student.sort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class StudentTestWithLambda {

	public static void main(String[] args) {
		File studentFile = new File("studentfile.txt");
		List<Student> studentList = new ArrayList<Student>();
		int lineCount = getLineCount(studentFile);
		for (int currentLine = 0; currentLine < lineCount; currentLine++) {
			studentList.add(populateStudentList(studentFile, currentLine));
		}
		System.out.println("Original student list : " + studentList);

		studentList.sort((Student one, Student two) -> one.getStudentNumber() - two.getStudentNumber());
		System.out.println("Sorted by Number : " + studentList);

		studentList.sort((Student one, Student two) -> one.getAge() - two.getAge());
		System.out.println("Sorted by Age : " + studentList);
		
		studentList.sort((Student one, Student two) -> one.getFirstName().compareTo(two.getFirstName()));
		System.out.println("Sorted by firstname : " + studentList);

		studentList.sort((Student one, Student two) -> one.getLastName().compareTo(two.getLastName()));
		System.out.println("Sorted by lastname : " + studentList);

		studentList.sort((Student one, Student two) -> one.getGrade() - two.getGrade());
		System.out.println("Sorted by grade : " + studentList);

		studentList.sort((Student one, Student two) -> one.getRank() - two.getRank());
		System.out.println("Sorted by rank : " + studentList);

	}

	private static Student populateStudentList(File studentFile, int lineNumber) {
		Student student = null;
		try {
			String lineData = (String) FileUtils.readLines(studentFile).get(lineNumber);
			String[] studentData = lineData.split(",");
			student = new Student(Integer.parseInt(studentData[0]), studentData[1], studentData[2],
					Integer.parseInt(studentData[3]), Integer.parseInt(studentData[4]),
					Integer.parseInt(studentData[5]));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return student;
	}

	private static int getLineCount(File studentFile) {
		int linesInFile = 0;
		LineIterator lineIterator = null;
		try {
			lineIterator = FileUtils.lineIterator(studentFile);
			while (lineIterator.hasNext()) {
				linesInFile++;
				lineIterator.nextLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			LineIterator.closeQuietly(lineIterator);
		}
		return linesInFile;
	}
}
