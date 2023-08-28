
public class CallByValue {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		System.out.println(a + "," + b);
		sum(a, b);
		System.out.println(a + "," + b);
		
		Employee e = new Employee("Tony");
		System.out.println(e);
		changeName(e);
		System.out.println(e);
		

	}
	
	static void changeName(Employee e) {
		e.name = "Tony Stark";
		System.out.println(e);
	}

	static void sum(int a, int b) {
		a = 123123;
		b = 1123;
		System.out.println("inside sum method " + a + "," + b);
	}

}

class Employee {
	String name;

	public Employee() {
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}	
	
}
