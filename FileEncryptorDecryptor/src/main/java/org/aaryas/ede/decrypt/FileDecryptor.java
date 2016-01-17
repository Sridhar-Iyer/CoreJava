package org.aaryas.ede.decrypt;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.jasypt.util.text.BasicTextEncryptor;

public class FileDecryptor {

	public void decryptFile(String password, String encryptedFile, String decryptedFile) {
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(password);
		String decryptedLine = null;
		try {
			File eFile = new File(encryptedFile);
			File dFile = new File(decryptedFile);
			List<String> lines = FileUtils.readLines(eFile);
			for(String line : lines) {
				decryptedLine = null;
				decryptedLine = textEncryptor.decrypt(line);
				FileUtils.writeStringToFile(dFile, decryptedLine, true);
				FileUtils.writeStringToFile(dFile, "\n", true);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
