
public class NonAccessModifiers {

	public static void main(String[] args) {

//		ModifiersByExample m1 = new ModifiersByExample();
//		m1.value=101;
//		
//		ModifiersByExample m2 = new ModifiersByExample();
//		m2.value=102;
//		
//		System.out.println(m1.value);
//		System.out.println(m2.value);

		System.out.println(ModifiersByExample.value);
		ModifiersByExample.value = 102;
		System.out.println(ModifiersByExample.value);

		ModifiersByExample m3 = new ModifiersByExample();
		m3.add();
		ModifiersByExample.add();

//		m3.value2 = 123;
//		m3.value2 = 123123;
		
		System.out.println(ModifiersByExample.SOME_CONSTANT_VALUE);
//		ModifiersByExample.SOME_CONSTANT_VALUE = 312231;

	}

}

class ModifiersByExample {

	static int value = 100;
	
	final int value2 = 12312;
	
	final static int SOME_CONSTANT_VALUE = 100; //constants


	static void add() {
		
	}


}
