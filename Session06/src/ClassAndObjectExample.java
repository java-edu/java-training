
public class ClassAndObjectExample {

	public static void main(String[] args) {
		
		int value = 0;
		
		LandVehicle car1 = new LandVehicle();
		System.out.println(car1.name);
		System.out.println(car1.price);
		car1.run();
		car1.stop();
		car1.name = "Honda City";
		car1.price = 1500000;
		System.out.println(car1.name);
		System.out.println(car1.price);
		car1.run();
		car1.stop();
		
		
		LandVehicle car2 = new LandVehicle("Honda Civic", 1500000, (short)4, (short)4);
		System.out.println(car2.name);
		System.out.println(car2.price);
		car2.run();
		car2.stop();
		
		
		LandVehicle bike1 = new LandVehicle("TVS Apache", 150000, (short)2, (short)2);
		System.out.println(bike1.name);
		System.out.println(bike1.price);
		bike1.race();
		bike1.breakV();
		
		
	}
}



class LandVehicle {
	
	//state | data members | instance variables | class variables | variables
	String name;
	double price;
	short noOfWheels;
	short noOfSeats;
	
	//constructor | also a method | has no return type | has same name as class
	LandVehicle(){ // default no-args constructor
		
	}
//	LandVehicle(String vehicleName, double vehiclePrice, short numberOfWheelsOnVehicle, short numberOfSeatsOnVehicle){
//		name = vehicleName;
//		price = vehiclePrice;
//		noOfWheels = numberOfWheelsOnVehicle;
//		noOfSeats = numberOfSeatsOnVehicle;
//	}
	LandVehicle(String name, double price, short noOfWheels, short noOfSeats){
		this.name = name;
		this.price = price;
		this.noOfWheels = noOfWheels;
		this.noOfSeats = noOfSeats;
	}
	
	
	
	//behaviour | member functions | methods
	void run() {
		System.out.printf("%s is running. \n", name);
	}
	void stop() {
		System.out.printf("%s has stopped. \n", name);
	}
	void race() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.run();
	}
	void breakV() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.stop();
	}
	
	
		
	
}

