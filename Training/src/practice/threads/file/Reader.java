package practice.threads.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class Reader implements Runnable {
	
	private BlockingQueue<Text> readerQueue;
	

	@Override
	public void run() {
		BufferedReader reader = null;
		try {
			File file = new File("sample.txt");
			
			reader = new BufferedReader(new FileReader(file),4096);
			String line = null;
			while((line = reader.readLine()) != null) {
				Text text = new Text(line);
				readerQueue.put(text);
				//System.out.println("Reader : " + text.getText());
			}
		}catch(IOException e) {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Reader(BlockingQueue<Text> readerQueue) {
		this.readerQueue = readerQueue;
	}

}
