
public class Abstraction {
	
	public static void main(String[] args) {
		
//		Human h1 = new Human();
//		h1.walk();
//		Animal h2 = new Human();
//		h2.walk();
	}

}


abstract class Animal {
	abstract void walk();
	void eat() {
		System.out.println("animal is eating");
	}
}

class Human extends Animal {

	@Override
	void walk() {
		System.out.println("walking on 2 legs");		
	}
	
}




//interface Animal {
//
//	void walk();
//	
//}
//
//class Human implements Animal {
//
//	@Override
//	public void walk() {
//		System.out.println("walking on 2 legs");
//	}
//	
//}
//
//class Dog implements Animal {
//
//	@Override
//	public void walk() {
//		System.out.println("walking on 4 legs");
//	}
//	
//} 




