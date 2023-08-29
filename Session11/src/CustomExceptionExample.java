
public class CustomExceptionExample {

	public static void main(String[] args) throws CustomException {

//		Animal aa = new Animal();
//		aa.type = "land-animal";
//		
//		try {
//			aa.fly();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}

		Animal aaa = new Animal();
		aaa.type = "sea-animal";

//		try {
//			aaa.fly();
//		} catch (CustomException e) {
//			System.out.println(e.getMessage());
//		} finally {
//			System.out.println("finally block");
//		}
		
		try {
			throw new CustomException("test");
		} finally {
			System.out.println("finally block");
		}
		

//		System.out.println("Program completed execution");

		// , try-finally, try-catch-finally

	}

}

class Animal {

	String type;

	void fly() throws CustomException, LandAnimalsCannotFlyException, SeaAnimalsCannotFlyException {
		if (type.equalsIgnoreCase("land-animal")) {
			throw new LandAnimalsCannotFlyException();
		} else if (type.equalsIgnoreCase("sea-animal")) {
			throw new SeaAnimalsCannotFlyException();
		}
		System.out.println("flying");
	}

	void move() {

	}
}
