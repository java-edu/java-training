import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MultiTasking {
	/**
	 * We have some work that takes 10 seconds
	 * 
	 */

	public static void main(String[] args) {
//		Timestamp start = Timestamp.valueOf(LocalDateTime.now());
//		for (int i = 0; i < 10; i++) {
//			Worker w = new Worker();
//			w.doSomeWork();
//		}
//		Timestamp end = Timestamp.valueOf(LocalDateTime.now());
//		System.out.println(ChronoUnit.MICROS.between(start.toInstant(), end.toInstant()));
		
		Timestamp start = Timestamp.valueOf(LocalDateTime.now());
		MultiThreadingWorker w1 = new MultiThreadingWorker();
		w1.start();
		MultiThreadingWorker w2 = new MultiThreadingWorker();
		w2.start();
		MultiThreadingWorker w3 = new MultiThreadingWorker();
		w3.start();
		MultiThreadingWorker w4 = new MultiThreadingWorker();
		w4.start();
		MultiThreadingWorker w5 = new MultiThreadingWorker();
		w5.start();
		try {
			w1.join();
			w2.join();
			w3.join();
			w4.join();
			w5.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Timestamp end = Timestamp.valueOf(LocalDateTime.now());
		System.out.println(ChronoUnit.MICROS.between(start.toInstant(), end.toInstant()));
	}
}

class MultiThreadingWorker extends Thread {

	void doSomeWork() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("worker is working: " + Thread.currentThread().getId());
	}

	public void run() {
		doSomeWork();
	}

}

class Worker {

	void doSomeWork() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("working");
	}
}