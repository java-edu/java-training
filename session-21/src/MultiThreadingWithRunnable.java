
public class MultiThreadingWithRunnable {
	
	public static void main(String[] args) {
		System.out.println("from main: " + Thread.currentThread().getId());
		RunnableWorker w = new RunnableWorker();
		new Thread(w).start();
		System.out.println("from main: " + Thread.currentThread().getId());
	}

}

class RunnableWorker implements Runnable {

	@Override
	public void run() {
		System.out.println("thread id: " + Thread.currentThread().getId());
	}
	
}

