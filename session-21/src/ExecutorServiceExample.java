import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

	public static void main(String[] args) {

		Timestamp start = Timestamp.valueOf(LocalDateTime.now());
		MultiThreadingRunnableWorker w1 = new MultiThreadingRunnableWorker();
		Thread t1 = new Thread(w1);
		//t1.start();
		MultiThreadingRunnableWorker w2 = new MultiThreadingRunnableWorker();
		Thread t2 = new Thread(w2);
		//t2.start();
		MultiThreadingRunnableWorker w3 = new MultiThreadingRunnableWorker();
		Thread t3 = new Thread(w3);
		//t3.start();
		MultiThreadingRunnableWorker w4 = new MultiThreadingRunnableWorker();
		Thread t4 = new Thread(w4);
		//t4.start();
		MultiThreadingRunnableWorker w5 = new MultiThreadingRunnableWorker();
		Thread t5 = new Thread(w5);
//		t5.start();
//		try {
//			t1.join();
//			t2.join();
//			t3.join();
//			t4.join();
//			t5.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		Timestamp end = Timestamp.valueOf(LocalDateTime.now());
//		System.out.println(ChronoUnit.MICROS.between(start.toInstant(), end.toInstant()));

		ExecutorService es = Executors.newFixedThreadPool(5);
		start = Timestamp.valueOf(LocalDateTime.now());
		es.execute(w1);
		es.execute(w2);
		es.execute(w3);
		es.execute(w4);
		es.execute(w5);
		es.execute(w1);
		es.execute(w2);
		es.execute(w3);
		es.execute(w4);
		es.execute(w5);
		try {
			es.awaitTermination(2, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		end = Timestamp.valueOf(LocalDateTime.now());
		System.out.println(ChronoUnit.MICROS.between(start.toInstant(), end.toInstant()));
	}

}

class MultiThreadingRunnableWorker implements Runnable {

	void doSomeWork() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("worker is working: " + Thread.currentThread().getId());
	}

	public void run() {
		doSomeWork();
	}

}
