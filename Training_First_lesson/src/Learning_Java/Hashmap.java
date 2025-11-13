package Learning_Java;

import java.util.HashMap;

public class Hashmap {
	public static void main(String[] args) {
		HashMap<String,Integer> mp = new HashMap<String,Integer>();
		mp.put("Apple",10);
		System.out.println(mp.get("Apple"));
		String key = "Hello";
		String key2 = "Hello2";
		int hash = key.hashCode();
		int hash2 = key2.hashCode();
		hash = (hash)^(hash>>>16);
		System.out.println(key.equals(key2));
		
		
;	}
}
