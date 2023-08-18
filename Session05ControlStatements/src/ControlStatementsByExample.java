import java.util.Iterator;

public class ControlStatementsByExample {

	public static void main(String[] args) {
//		ifElseExample();
//		switchCaseExample();
//		forLoopExample();
//		whileLoopExample();
//		doWhileLoopExample();
		
		
//		boolean cond = false;
//		while (cond) {
//			System.out.println("while loop block");
//		}
//		System.out.println();
//		
//		do {
//			System.out.println("do while loop block");
//		} while (cond);
//		System.out.println();
		
		continueAndBreakStatementExample();
	}
	
	
	private static void continueAndBreakStatementExample() {
		//program to print even and skip a range of values in between
		int from = 10;
		int till = 30;
		int skipFrom = 20;
		int skipTill = 25;

		while (true) {
			if (from >= skipFrom && from <= skipTill) {
				from++;
				continue;
			}
			if (from%2==0) {
				System.out.println(from + ",");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (from == till) {
				break;
			}
			from++;
		}
	}
	
	
	private static void doWhileLoopExample() {
		int i = 1;
		do {
			System.out.print(i + ",");
			i++;
		} while (i <= 10);
		System.out.println();
	}
	
	private static void whileLoopExample() {
		int i = 1;
		while (i <= 10) {
			System.out.print(i + ",");
			i++;
		}		
	}
	
	
	private static void forLoopExample() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + ",");
		}
		System.out.println();
	}
	
	

	private static void ifElseExample() {
		int value = 101;
		if (value % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
	
	private static void switchCaseExample() {
		int value = 101;
		switch (value % 2) {
		case 0: {
			System.out.println("even");
			break;
		}
		case 1: {
			System.out.println("odd");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + value % 2);
		}
	}

}
