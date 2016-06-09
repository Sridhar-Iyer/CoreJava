package practice.blockingqueue.pandc;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	BlockingQueue<Message> bqueue;
	
	public Consumer(BlockingQueue<Message> bqueue) {
		super();
		this.bqueue = bqueue;
	}

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			Message message;
			try {
				while((message = bqueue.take()).getMessage() != "exit") {
					
					System.out.println("Consumer: " + message.getMessage());
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
