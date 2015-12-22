package edu.training.ede.encrypt;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.jasypt.util.text.BasicTextEncryptor;

public class FileEncryptor {

	public void encryptFile(String password, String originalFile, String encryptedFile) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(password);
		String encryptedLine = null;
		try {
			File oFile = new File(originalFile);
			File eFile = new File(encryptedFile);
			List<String> lines = FileUtils.readLines(oFile);
			for(String line : lines) {
				encryptedLine = null;
				encryptedLine = textEncryptor.encrypt(line);
				FileUtils.writeStringToFile(eFile, encryptedLine, true);
				FileUtils.writeStringToFile(eFile, "\n", true);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
