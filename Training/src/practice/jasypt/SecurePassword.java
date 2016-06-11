package practice.jasypt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.properties.EncryptableProperties;

public class SecurePassword {
	
	public static void main(String[] args) {
		
		StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
		encryptor.setPassword("jasypt"); 
		Properties props = new EncryptableProperties(encryptor);
		 
		try {
			props.load(new FileInputStream("configuration.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(props.get("username"));
		System.out.println(props.getProperty("password"));
	}

}
