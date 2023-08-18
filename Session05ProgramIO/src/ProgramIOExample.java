import java.util.Scanner;

public class ProgramIOExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = scan.nextLine();
		
		System.out.println("Please enter your age:");
		short age = scan.nextShort();
		scan.nextLine();
		
		System.out.println("Please enter your place:");
		String place = scan.nextLine();
		
		System.out.printf("Name: %s, Age: %d, Place: %s \n", name, age, place);
		System.out.println("Name: "+name+", Age: "+age+", Place: " + place);

		
		
	}

}
