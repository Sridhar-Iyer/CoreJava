package practice;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import static org.apache.commons.io.FileUtils.readLines;
import org.apache.commons.lang3.StringUtils;

public class XMLValueFinder {

	public static void main(String[] args) {
		getAttributes("keyword", "enabled");
	}

	public static void getAttributes(String keyword, String lookupKey) {
		try {
			File xmlFile = new File("somefile.xml");

			// read the entire xml file as a String
			List<String> xmlString = readLines(xmlFile, Charset.defaultCharset());

			// iterate through each line
			for (String line : xmlString) {

				String[] kv = null;
				String value = null;
				// search for the line that contains your keyword
				if (StringUtils.containsIgnoreCase(line, keyword)) {

					// extract the value for the lookup key
					// split the line based on space
					String[] keyValuePairs = line.split("\\s");

					for (String kvPair : keyValuePairs) {
						// split the keyValuePairs based on "="
						kv = kvPair.split("=");

						for (int i = 0; i < kv.length; i++) {
							if (kv[i].equals(lookupKey)) {
								value = kv[++i];
								System.out.println(value);
							}
						}

					}

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
