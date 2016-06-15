package practice.threads.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;

public class Writer implements Runnable {
	
	BlockingQueue<Text> writerQueue;

	public Writer(BlockingQueue<Text> writerQueue) {
		this.writerQueue = writerQueue;
	}

	
	@Override
	public void run() {
		BufferedWriter writer = null;
		try {
			File file = new File("output.txt");
			writer = new BufferedWriter(new FileWriter(file,true),4096);
			Text text;
			while((text = writerQueue.take()).getText() != "EOF") {
				System.out.println("Writer : " + text.getText());
				writer.write(text.getText());
				writer.write("\n");
			}
			
		}catch(IOException e)  {
			e.printStackTrace();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		

	}
	
	

}
