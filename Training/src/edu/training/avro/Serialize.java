package edu.learning.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

public class Serialize {

	public static void main(String[] args)  throws IOException {
		
		education.learning.Employee emp= new education.learning.Employee("Sridhar",10, 900000000,  32 ,"California");
		
		DatumWriter<education.learning.Employee> empDataumWriter = new SpecificDatumWriter<education.learning.Employee>(education.learning.Employee.class);
		DataFileWriter<education.learning.Employee> empFileWriter = new DataFileWriter<education.learning.Employee>(empDataumWriter);
		
		empFileWriter.create(emp.getSchema(), new File("emp.avro"));
		empFileWriter.append(emp);
		empFileWriter.close();
		
		System.out.println("Data successfullly serialized");
		
	}

}
