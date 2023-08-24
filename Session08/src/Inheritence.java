
public class Inheritence {

	public static void main(String[] args) {

//		Car c = new Car();
//		c.noOfWheels = 4;
//		c.run();
//		c.noOfWindows = 4;
//
//		Bike b = new Bike();
//		b.noOfWheels = 2;
//		b.run();
////		b.noOfWin
//
//		HondaCivic h = new HondaCivic();
//		h.noOfWheels = 4;
//		h.noOfWindows = 4;
//		h.run();
//		
//		Tomato t1 = new Tomato();
//		System.out.println(t1.taste);
//		
//		Vegetable t2 = new Tomato();
//		System.out.println(t2.taste);
		
//		Car c3 = new Car();
//		c3.race();
//		c3.run();
		
		Vehicle c4 = new Car();
		c4.run();
		


	}

}

//class DummyParentOne {
//
//	void run() {
//
//	}
//}
//
//class DummyParentTwo {
//	
//	void run() {
//
//	}
//}
//
//class DummyChild extends DummyParentOne, DummyParentTwo{
//
//}

//class DummyOne extends DummyTwo{
//	
//	void run() {
//
//	}
//	
//}
//
//class DummyTwo extends DummyOne{
//	
//	void run() {
//
//	}
//
//}

class Vegetable {

	String taste = "sweet/sour/bitter";

}

class Tomato extends Vegetable {
	
	String taste = "sweet";

}

class Vehicle {

	int noOfWheels;

	void run() {
		System.out.println("vehicle running");
	}

}

class Car extends Vehicle {

	int noOfWindows;
	
	void race() {
		super.run();
	}
	
	void run() {
		System.out.println("car running");
	}

}

class HondaCivic extends Car {

}

class Bike extends Vehicle {

}
