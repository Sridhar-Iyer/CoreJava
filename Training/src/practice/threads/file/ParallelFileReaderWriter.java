package practice.threads.file;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ParallelFileReaderWriter {

	public static void main(String[] args) {
		BlockingQueue<Text> queue = new ArrayBlockingQueue<>(4096);
		Reader reader = new Reader(queue);
		Writer writer = new Writer(queue);
		
		new Thread(reader).start();
		new Thread(writer).start();
		
	}

}
