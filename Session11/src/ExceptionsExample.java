
public class ExceptionsExample {
	
	public static void main(String[] args) throws InterruptedException {
		
		try {
			Thread.sleep(100);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
//		
//		Thread.sleep(100);
//		
//		int a = 0;
//		int b = 123123;
//		
////		System.out.println(b/a);
//
//		try {
//			System.out.println(b/a);
//		} catch (Exception e) {
//			System.out.println("cannot divide by zero");
//		}
//		
//		System.out.println("after divide by zero");
		
		Animal a = new Animal();
		a.move();
		
		try {
			Animal aa = null;
			aa.move();
		} catch (Exception e) {
			System.out.println("object is null");
		}
		System.out.println("after calling move method");
		
	}

}


