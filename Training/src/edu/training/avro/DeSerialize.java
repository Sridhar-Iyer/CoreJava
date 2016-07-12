package edu.training.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.commons.io.FileUtils;

import edu.training.Employee;

public class DeSerialize {

	public static void main(String[] args) throws IOException {
		
		File dataFile = new File("Employee.txt");
		DatumReader<Employee> empDatumReader = new SpecificDatumReader<Employee>(Employee.class);
		
		@SuppressWarnings("resource")
		DataFileReader<Employee> dataFileReader = new DataFileReader<Employee>(new File("emp.avro"), empDatumReader);
		
		Employee emp = null;
		
		while(dataFileReader.hasNext()) {
			emp = dataFileReader.next(emp);
			FileUtils.writeStringToFile(dataFile, emp.toString(), true);
			//FileUtils.writeStringToFile(dataFile, "\n", true);
		}
	}

}
