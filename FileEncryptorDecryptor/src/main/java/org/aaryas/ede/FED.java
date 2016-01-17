package org.aaryas.ede;

import edu.training.ede.decrypt.FileDecryptor;
import edu.training.ede.encrypt.FileEncryptor;

public class FED {

	public static void main(String[] args) {
		String password = "#E#$#$$^%&^#$%#$%#@#$@#$#@";
		String originalFile = "originalFile.txt";
		String encryptedFile = "encryptedFile.txt";
		String decryptedFile = "decryptedFile.txt";
		
		FileEncryptor fileEncryptor = new FileEncryptor();
		FileDecryptor fileDecryptor = new FileDecryptor();
		
		fileEncryptor.encryptFile(password, originalFile, encryptedFile);
		fileDecryptor.decryptFile(password, encryptedFile, decryptedFile);
		
	}
}
