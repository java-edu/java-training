import java.util.HashMap;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultiMapExample {
	
	public static void main(String[] args) {
		
		Multimap<String, String> mm = ArrayListMultimap.create();
		mm.put("grocery", "fruits");
		mm.put("grocery", "soap");
		System.out.println(mm);
		
		HashMap<String, String> m = new HashMap<>();
		m.put("grocery", "fruits");
		m.put("grocery", "soap");
		System.out.println(m);

	}

}
