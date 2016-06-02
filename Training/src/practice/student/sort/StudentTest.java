package practice.student.sort;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class StudentTest {

	public static void main(String[] args) throws IOException {
		File studentFile = new File("studentfile.txt");
		List<Student> studentList = new ArrayList<Student>();
		int lineCount = getLineCount(studentFile);
		for(int currentLine = 0; currentLine < lineCount; currentLine++ ) {
			studentList.add(populateStudentList(studentFile, currentLine));
		}
		System.out.println("Original student list : " + studentList);
		
		SortByStudentNumber ssn = new SortByStudentNumber();
		Collections.sort(studentList, ssn);
		System.out.println("Sorted by Number : " + studentList);
		
		SortByStudentAge ssa = new SortByStudentAge();
		Collections.sort(studentList, ssa);
		System.out.println("Sorted by Age : " + studentList);
		
		SortByStudentFirstName ssf = new SortByStudentFirstName();
		Collections.sort(studentList, ssf);
		System.out.println("Sorted by firstname : " + studentList);
		
		SortByStudentLastName ssl = new SortByStudentLastName();
		Collections.sort(studentList, ssl);
		System.out.println("Sorted by lastname : " + studentList);
		
		SortByStudentGrade ssg = new SortByStudentGrade();
		Collections.sort(studentList, ssg);
		System.out.println("Sorted by grade : " + studentList);
		
		SortByStudentRank ssr = new SortByStudentRank();
		Collections.sort(studentList, ssr);
		System.out.println("Sorted by rank : " + studentList);
	}

	private static Student populateStudentList(File studentFile, int lineNumber) {
		Student student = null;
  		try {
			String lineData = (String) FileUtils.readLines(studentFile).get(lineNumber);
			String[] studentData = lineData.split(",");
			student = new Student(Integer.parseInt(studentData[0]),studentData[1],studentData[2],Integer.parseInt(studentData[3]),Integer.parseInt(studentData[4]),Integer.parseInt(studentData[5]));
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
			while(lineIterator.hasNext()) {
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
