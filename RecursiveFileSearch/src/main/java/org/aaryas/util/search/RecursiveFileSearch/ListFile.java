package org.aaryas.util.search.RecursiveFileSearch;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

// list files
public class ListFile {

	public static void main(String[] args) {

		File root = new File("C:\\Users\\Sridhar\\github\\CoreJava");
		String[] extensions = { "java", "xml", "properties" };
		boolean recursive = true;
		Collection<?> files = FileUtils.listFiles(root, extensions, recursive);

		for (Iterator<?> iterator = files.iterator(); iterator.hasNext();) {
			File file = (File) iterator.next();
			search(file.getAbsolutePath());
		}
	}

	public static void search(String filePath) {

		File file = new File(filePath);
		try {
			List<String> lines = FileUtils.readLines(file);
			for (String line : lines) {
				if (StringUtils.containsIgnoreCase(line, "data")
						&& StringUtils.containsIgnoreCase(line, "null")) {
					System.out.println(filePath + " : " + line);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
