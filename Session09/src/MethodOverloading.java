
public class MethodOverloading {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.run();
		Vehicle c2 = new Car();
		c2.run();
		Vehicle v1 = new Vehicle();
		v1.run();

	}

}

class Vehicle {
	void run() {
		System.out.println("run vehicle");
	}
}

class Car extends Vehicle {
	void run() {
		System.out.println("run car");
	}
}

class MethodOverloadingExample {

	void add(int a, int b) {

	}

//	void add(int a, int b) {
//
//	}

	void add(int a, double b) {

	}

	void add(double a, int b) {

	}

	void add(int a, int b, int c) {

	}

}
