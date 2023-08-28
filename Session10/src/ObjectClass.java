
public class ObjectClass {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		
		Animal a = new Animal();
		Animal b = new Animal();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		

	}

}

class Vehicle {
	
	void run() {}
	
}

class Car extends Vehicle {
	
	void race() {}
	
	
}

class Animal {
	
	public String toString() {
        return "This is an object of Animal class.";
    }
	
}