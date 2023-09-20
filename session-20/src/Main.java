import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		while (true) {
			try {
				System.out.println(LocalDateTime.now());
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
