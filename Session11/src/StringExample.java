
public class StringExample {
	
	public static void main(String[] args) {
		
		String s = "asd";
		String ss = new String("asasda");
		
		System.out.println(s.hashCode());
		s = "allex";
		System.out.println(s.hashCode());

		System.out.println(s.length());
		System.out.println(s.substring(2));
		System.out.println(s.substring(2,4));
		System.out.println(s.replace("ll", "p"));
		
		String sss = s + ss + "asasdda";
		sss = s.concat(ss);
		System.out.println(sss);

		
		
	}

}
