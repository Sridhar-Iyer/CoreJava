package practice.blockingqueue.pandc;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	BlockingQueue<Message> bqueue ;
	
	public Producer(BlockingQueue<Message> bqueue) {
		super();
		this.bqueue = bqueue;
	}

	@Override
	public void run() {
		for(int i=0; i < 1000; i++) {
			Message message = new Message(" " + i);
			try {
				bqueue.put(message);
				System.out.println("Producer :" + message.getMessage());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Message message = new Message("exit");
		try {
			bqueue.put(message);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
