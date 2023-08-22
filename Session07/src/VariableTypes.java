
import com.google.controllers.*;

public class VariableTypes {
	
	
	
	public static void main(String[] args) {
				
		int b = 10;
		doSomething();
//		System.out.println(a);
		
		SomeDummyClass o1 =new SomeDummyClass();
		SomeDummyClass o2 = new SomeDummyClass();
		System.out.println(o1.c);
		System.out.println(o2.c);
		System.out.println(o1.d);
		System.out.println(o2.d);
//		System.out.println(SomeDummyClass.c);
		System.out.println(SomeDummyClass.d);
		o1.c = 13;
		o2.c = 14;
		System.out.println(o1.c);
		System.out.println(o2.c);
		o1.d = 16;
		o2.d = 17;
		System.out.println(o1.d);
		System.out.println(o2.d);
		System.out.println(SomeDummyClass.d);
		
		DummyClassInAnotherPackage d = new DummyClassInAnotherPackage();
		DummyClass2InAnotherPackage d2 = new  DummyClass2InAnotherPackage();
//		DefaultModifierDummyClassInAnotherPackage

		
		DummyClassInAnotherPackage da = new DummyClassInAnotherPackage();
//		System.out.println(da.a);
//		System.out.println(d.b);
		System.out.println(da.c);

	}
	
	static void doSomething() {
		int a = 9;
		System.out.println(a);
//		System.out.println(b);

	}

}


class SomeDummyClass {
	
	int c = 12;
	static int d = 15;

	void doSomething() {
		System.out.println(c);
		System.out.println(d);
	}

}