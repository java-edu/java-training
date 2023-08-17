
public class TypeCastingByExample {

	public static void main(String[] args) {
		byte b = 100;
		int i = b; // widening
		System.out.println(b);
		System.out.println(i);
		b = (byte) i; // narrowing | no data loss since i is 100 and byte can hold it
		System.out.println(b);
		System.out.println(i);
		i = 1323123;
		b = (byte) i; // narrowing | data loss here since byte cannot hold 1323123
		System.out.println(b);
		System.out.println(i);
		
		long l =  9223372036854775807l;
		i = (int) l;
		System.out.println(l);
		System.out.println(i);


	}
}
