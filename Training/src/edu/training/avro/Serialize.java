package edu.training.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;

public class Serialize {

	public static void main(String[] args)  throws IOException {
		
		edu.training.Employee emp= new edu.training.Employee("Sridhar",10, 900000000,  32 ,"California");
		
		DatumWriter<edu.training.Employee> empDataumWriter = new SpecificDatumWriter<edu.training.Employee>(edu.training.Employee.class);
		DataFileWriter<edu.training.Employee> empFileWriter = new DataFileWriter<edu.training.Employee>(empDataumWriter);
		
		empFileWriter.create(emp.getSchema(), new File("emp.avro"));
		empFileWriter.append(emp);
		empFileWriter.close();
		
		System.out.println("Data successfullly serialized");
		
	}

}
