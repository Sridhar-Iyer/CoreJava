package edu.training.utils;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.exec.ExecuteException;
import org.apache.commons.exec.Executor;
import org.apache.commons.exec.PumpStreamHandler;
import org.apache.commons.io.FileUtils;

/**
 * 
 * @author Sridhar
 *
 *         This program executes an .exe file which takes a file as an input and
 *         produces results. This uses apache-commons-exec to read the file,
 *         execute the file and display the generated output to the console.
 * 
 */

public class FileInputReader {

	private void executeFile(String exeFile, String input_file,
			String output_file) {
		File inputfile = new File(input_file);
		File outputFile = new File(output_file);
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		String data = null;
		try {
			// reads the file data as a string
			data = FileUtils.readFileToString(inputfile);
			Executor executor = new DefaultExecutor();
			CommandLine commandLine = new CommandLine(exeFile);
			input = new ByteArrayInputStream(data.getBytes("ISO-8859-1"));
			executor.setStreamHandler(new PumpStreamHandler(output, null, input));
			executor.execute(commandLine);
			FileUtils.writeStringToFile(outputFile,
					output.toString("ISO-8859-1"));
		} catch (ExecuteException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		FileInputReader fir = new FileInputReader();
		fir.executeFile(Constants.EXECUTABLE_FILE, Constants.INPUT_FILE, Constants.OUTPUT_FILE);
	}
}
