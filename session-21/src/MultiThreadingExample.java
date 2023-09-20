
public class MultiThreadingExample {

	public static void main(String[] args) {

		System.out.println("from main: " + Thread.currentThread().getId());
		MyWorker1 w1 = new MyWorker1();
		w1.start();
		System.out.println("from main: " + Thread.currentThread().getId());
	}

}

class MyWorker1 extends Thread {

	public void run() {
		System.out.println("from worker1: " + Thread.currentThread().getId());
	}

}
